import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class73 {

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public int field922 = -1;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "[I")
    private int[] field931 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "Z")
    public boolean field927 = false;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field925 = -1;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "[I")
    public static int[] field921 = new int[50];

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "[I")
    public static int[] field928 = new int[6];

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "[I")
    private int[] field929;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "[S")
    private short[] field912;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "[S")
    private short[] field919;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "[S")
    private short[] field923;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "[S")
    private short[] field930;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)Lg;", line = 5)
    public final class86 method466(int arg0) {
        field916++;
        class86[] var2 = new class86[5];
        int var3 = arg0;
        class447 var4 = class217.field3546;
        synchronized (class217.field3546) {
            for (int var5 = 0; var5 < 5; var5++) {
                if (this.field931[var5] != -1) {
                    var2[var3++] = class21.method154(this.field931[var5], class217.field3546, 0, (byte) 34);
                }
            }
        }
        class86 var6 = new class86(var2, var3);
        if (this.field930 != null) {
            for (int var7 = 0; var7 < this.field930.length; var7++) {
                var6.method523(this.field923[var7], 123, this.field930[var7]);
            }
        }
        if (this.field919 != null) {
            for (int var8 = 0; var8 < this.field919.length; var8++) {
                var6.method534(this.field912[var8], true, this.field919[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)Z", line = 62)
    public final boolean method467(int arg0) {
        field926++;
        if (this.field929 == null) {
            return true;
        }
        boolean var2 = true;
        class447 var3 = class217.field3546;
        synchronized (class217.field3546) {
            for (int var4 = arg0; var4 < this.field929.length; var4++) {
                if (!class217.field3546.method2775(0, (byte) -37, this.field929[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IILjg;)V", line = 91)
    private final void method468(int arg0, int arg1, class186 arg2) {
        if (arg1 != -6) {
            return;
        }
        field914++;
        if (arg0 == 1) {
            this.field922 = arg2.method1322(false);
        } else if (arg0 == 2) {
            int var4 = arg2.method1322(false);
            this.field929 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field929[var5] = arg2.method1272((byte) -65);
            }
            return;
        } else if (arg0 == 3) {
            this.field927 = true;
            return;
        } else if (arg0 == 40) {
            int var6 = arg2.method1322(false);
            this.field923 = new short[var6];
            this.field930 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field930[var7] = (short) arg2.method1272((byte) -117);
                this.field923[var7] = (short) arg2.method1272((byte) -59);
            }
            return;
        } else if (arg0 == 41) {
            int var8 = arg2.method1322(false);
            this.field912 = new short[var8];
            this.field919 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field919[var9] = (short) arg2.method1272((byte) -51);
                this.field912[var9] = (short) arg2.method1272((byte) -104);
            }
            return;
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field931[arg0 - 60] = arg2.method1272((byte) -53);
            return;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)Z", line = 168)
    public final boolean method469(byte arg0) {
        field915++;
        boolean var2 = true;
        class447 var3 = class217.field3546;
        synchronized (class217.field3546) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field931[var4] != -1 && !class217.field3546.method2775(0, (byte) -37, this.field931[var4])) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 != -76) {
            this.method470((byte) 83, (class186) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BLjg;)V", line = 205)
    public final void method470(byte arg0, class186 arg1) {
        if (arg0 != -67) {
            return;
        }
        field918++;
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                return;
            }
            this.method468(var3, arg0 ^ 0x47, arg1);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V", line = 231)
    public static final void method471(byte arg0) {
        class144.field2267 = 0;
        field913++;
        class86.field1089.method255(-20994);
        class86.field1089.method245(500, class382.field5768);
        if (arg0 < 84) {
            field921 = null;
        }
        class144.field2267++;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(B)J", line = 259)
    public static final long method472(byte arg0) {
        field917++;
        if (arg0 != -101) {
            method474(-78);
        }
        return class249.field4072.method1369((byte) 83);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)Lg;", line = 270)
    public final class86 method473(boolean arg0) {
        field932++;
        if (this.field929 == null) {
            return null;
        }
        class86[] var2 = new class86[this.field929.length];
        class447 var3 = class217.field3546;
        synchronized (class217.field3546) {
            int var4 = 0;
            while (true) {
                if (this.field929.length <= var4) {
                    break;
                }
                var2[var4] = class21.method154(this.field929[var4], class217.field3546, 0, (byte) 34);
                var4++;
            }
        }
        class86 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class86(var2, var2.length);
        }
        if (!arg0) {
            this.field929 = null;
        }
        if (var5 == null) {
            return null;
        }
        if (this.field930 != null) {
            for (int var6 = 0; var6 < this.field930.length; var6++) {
                var5.method523(this.field923[var6], 103, this.field930[var6]);
            }
        }
        if (this.field919 != null) {
            for (int var7 = 0; var7 < this.field919.length; var7++) {
                var5.method534(this.field912[var7], arg0, this.field919[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V", line = 332)
    public static void method474(int arg0) {
        field928 = null;
        if (arg0 != 0) {
            field933 = 16;
        }
        field921 = null;
    }
}
