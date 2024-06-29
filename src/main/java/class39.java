import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!OQTNTOVY")
public class class39 {

    @OriginalMember(owner = "client!OQTNTOVY", name = "b", descriptor = "I")
    private int field1110 = 153;

    @OriginalMember(owner = "client!OQTNTOVY", name = "e", descriptor = "I")
    public int field1113 = -1;

    @OriginalMember(owner = "client!OQTNTOVY", name = "g", descriptor = "[I")
    public int[] field1115 = new int[6];

    @OriginalMember(owner = "client!OQTNTOVY", name = "h", descriptor = "[I")
    public int[] field1116 = new int[6];

    @OriginalMember(owner = "client!OQTNTOVY", name = "i", descriptor = "[I")
    public int[] field1117 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!OQTNTOVY", name = "j", descriptor = "Z")
    public boolean field1118 = false;

    @OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "I")
    private static int field1109 = 2;

    @OriginalMember(owner = "client!OQTNTOVY", name = "c", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!OQTNTOVY", name = "f", descriptor = "[I")
    public int[] field1114;

    @OriginalMember(owner = "client!OQTNTOVY", name = "d", descriptor = "[LOQTNTOVY;")
    public static class39[] field1112;

    @OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "(ZLVSQMPWOM;)V")
    public static void method363(boolean arg0, class59 arg1) {
        class3 var2 = new class3(arg1.method526("idk.dat", null), -990);
        field1111 = var2.method56();
        if (field1112 == null) {
            field1112 = new class39[field1111];
        }
        for (int var3 = 0; var3 < field1111; var3++) {
            if (field1112[var3] == null) {
                field1112[var3] = new class39();
            }
            field1112[var3].method364((byte) -11, var2);
        }
        if (!arg0) {
            field1109 = -108;
        }
    }

    @OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "(BLBFQIDHPO;)V")
    public void method364(byte arg0, class3 arg1) {
        if (arg0 != -11) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg1.method54();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1113 = arg1.method54();
                } else if (var4 == 2) {
                    int var5 = arg1.method54();
                    this.field1114 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1114[var6] = arg1.method56();
                    }
                } else if (var4 == 3) {
                    this.field1118 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1115[var4 - 40] = arg1.method56();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1116[var4 - 50] = arg1.method56();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1117[var4 - 60] = arg1.method56();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "(I)Z")
    public boolean method365(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else if (this.field1114 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1114.length; var3++) {
                if (!class65.method542(this.field1114[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!OQTNTOVY", name = "a", descriptor = "(B)LXBVYIDUH;")
    public class65 method366(byte arg0) {
        if (this.field1114 == null) {
            return null;
        }
        class65[] var2 = new class65[this.field1114.length];
        if (arg0 != 107) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1114.length; var3++) {
            var2[var3] = class65.method541(this.field1114[var3]);
        }
        class65 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class65(var2, 273, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1115[var5] != 0; var5++) {
            var4.method555(this.field1115[var5], this.field1116[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!OQTNTOVY", name = "b", descriptor = "(I)Z")
    public boolean method367(int arg0) {
        boolean var2 = true;
        if (arg0 != -8240) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1117[var4] != -1 && !class65.method542(this.field1117[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!OQTNTOVY", name = "c", descriptor = "(I)LXBVYIDUH;")
    public class65 method368(int arg0) {
        class65[] var2 = new class65[5];
        int var3 = 0;
        if (arg0 != 0) {
            this.field1110 = 294;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1117[var4] != -1) {
                var2[var3++] = class65.method541(this.field1117[var4]);
            }
        }
        class65 var5 = new class65(var2, 273, var3);
        for (int var6 = 0; var6 < 6 && this.field1115[var6] != 0; var6++) {
            var5.method555(this.field1115[var6], this.field1116[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "client!OQTNTOVY", name = "<init>", descriptor = "()V")
    public class39() {
        if (class30.field1023) {
        }
    }
}
