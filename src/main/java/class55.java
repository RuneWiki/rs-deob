import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class55 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "[I")
    private int[] field635 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "Z")
    public boolean field638 = false;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public int field654 = -1;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field639 = new String[1000];

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "Lue;")
    public static class19 field656 = new class19();

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "[Lui;")
    public static class293[] field659 = new class293[14];

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field661 = 0;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field648;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "Lnc;")
    public static class164 field662;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "Lkf;")
    public static class249 field646;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[I")
    private int[] field641;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "[Lcf;")
    public static class149[] field647;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "[S")
    private short[] field637;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "[S")
    private short[] field644;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "[S")
    private short[] field645;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "[S")
    private short[] field649;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 6)
    public static final void method325(byte arg0) {
        int var1 = 77 / ((82 - arg0) / 40);
        class116.field1615.method604(144);
        field653++;
        class28.field330 = 1;
        class282.field4498 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)Lrd;", line = 18)
    public final class193 method326(int arg0) {
        field640++;
        if (this.field641 == null) {
            return null;
        }
        class193[] var2 = new class193[this.field641.length];
        for (int var3 = 0; var3 < this.field641.length; var3++) {
            var2[var3] = class193.method1319(class337.field5379, this.field641[var3], 0);
        }
        class193 var4;
        if (var2.length == arg0) {
            var4 = var2[0];
        } else {
            var4 = new class193(var2, var2.length);
        }
        if (this.field644 != null) {
            for (int var5 = 0; var5 < this.field644.length; var5++) {
                var4.method1339(this.field644[var5], this.field649[var5]);
            }
        }
        if (this.field637 != null) {
            for (int var6 = 0; var6 < this.field637.length; var6++) {
                var4.method1331(this.field637[var6], this.field645[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 76)
    public static void method327(int arg0) {
        field656 = null;
        field639 = null;
        field659 = null;
        if (arg0 > -51) {
            field652 = 27;
        }
        field646 = null;
        field662 = null;
        field647 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLlf;I)V", line = 97)
    private final void method328(byte arg0, class143 arg1, int arg2) {
        if (arg2 == 1) {
            this.field654 = arg1.method1043(true);
        } else if (arg2 == 2) {
            int var8 = arg1.method1043(true);
            this.field641 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field641[var9] = arg1.method1051(arg0 - 100);
            }
        } else if (arg2 == 3) {
            this.field638 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method1043(true);
            this.field644 = new short[var6];
            this.field649 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field644[var7] = (short) arg1.method1051(1);
                this.field649[var7] = (short) arg1.method1051(1);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method1043(true);
            this.field637 = new short[var4];
            this.field645 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field637[var5] = (short) arg1.method1051(1);
                this.field645[var5] = (short) arg1.method1051(1);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field635[arg2 - 60] = arg1.method1051(1);
        }
        if (arg0 != 101) {
            method327(33);
        }
        field655++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)Lrd;", line = 176)
    public final class193 method329(boolean arg0) {
        class193[] var2 = new class193[5];
        field642++;
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field635[var4] != -1) {
                var2[var3++] = class193.method1319(class337.field5379, this.field635[var4], 0);
            }
        }
        if (!arg0) {
            return (class193) null;
        }
        class193 var5 = new class193(var2, var3);
        if (this.field644 != null) {
            for (int var6 = 0; var6 < this.field644.length; var6++) {
                var5.method1339(this.field644[var6], this.field649[var6]);
            }
        }
        if (this.field637 != null) {
            for (int var7 = 0; var7 < this.field637.length; var7++) {
                var5.method1331(this.field637[var7], this.field645[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)Z", line = 232)
    public final boolean method330(int arg0) {
        boolean var2 = true;
        int var3 = -50 / ((-arg0 - 21) / 33);
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field635[var4] != -1 && !class337.field5379.method95(this.field635[var4], 0, (byte) 71)) {
                var2 = false;
            }
        }
        field650++;
        return var2;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(Z)Z", line = 256)
    public final boolean method331(boolean arg0) {
        field648++;
        if (this.field641 == null) {
            return true;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < this.field641.length; var3++) {
            if (!class337.field5379.method95(this.field641[var3], 0, (byte) 71)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILlf;)V", line = 281)
    public final void method332(int arg0, class143 arg1) {
        int var3 = -17 % ((arg0 + 70) / 37);
        while (true) {
            int var4 = arg1.method1043(true);
            if (var4 == 0) {
                field636++;
                return;
            }
            this.method328((byte) 101, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lwf;Z)I", line = 305)
    public static final int method333(class67 arg0, boolean arg1) {
        field651++;
        if (!arg1) {
            return -105;
        }
        int var2 = arg0.field828;
        class282 var3 = arg0.method1719(-1);
        if (arg0.field3778 == var3.field4486) {
            var2 = arg0.field845;
        } else if (arg0.field3778 == var3.field4464 || arg0.field3778 == var3.field4471 || arg0.field3778 == var3.field4492 || arg0.field3778 == var3.field4469) {
            var2 = arg0.field824;
        } else if (arg0.field3778 == var3.field4468 || arg0.field3778 == var3.field4475 || arg0.field3778 == var3.field4458 || arg0.field3778 == var3.field4470) {
            var2 = arg0.field821;
        }
        return var2;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLjava/lang/String;)I", line = 336)
    public static final int method334(byte arg0, String arg1) {
        field643++;
        if (arg0 != -5) {
            method327(-38);
        }
        return arg1.length() + 1;
    }
}
