import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!LZZHVUJR")
public class class33 {

    @OriginalMember(owner = "client!LZZHVUJR", name = "a", descriptor = "Z")
    private boolean field961 = false;

    @OriginalMember(owner = "client!LZZHVUJR", name = "h", descriptor = "I")
    public int field968 = -1;

    @OriginalMember(owner = "client!LZZHVUJR", name = "j", descriptor = "Z")
    public boolean field970 = false;

    @OriginalMember(owner = "client!LZZHVUJR", name = "k", descriptor = "I")
    public int field971 = 5;

    @OriginalMember(owner = "client!LZZHVUJR", name = "l", descriptor = "I")
    public int field972 = -1;

    @OriginalMember(owner = "client!LZZHVUJR", name = "m", descriptor = "I")
    public int field973 = -1;

    @OriginalMember(owner = "client!LZZHVUJR", name = "n", descriptor = "I")
    public int field974 = 99;

    @OriginalMember(owner = "client!LZZHVUJR", name = "o", descriptor = "I")
    public int field975 = -1;

    @OriginalMember(owner = "client!LZZHVUJR", name = "p", descriptor = "I")
    public int field976 = -1;

    @OriginalMember(owner = "client!LZZHVUJR", name = "q", descriptor = "I")
    public int field977 = 2;

    @OriginalMember(owner = "client!LZZHVUJR", name = "b", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!LZZHVUJR", name = "d", descriptor = "I")
    public int field964;

    @OriginalMember(owner = "client!LZZHVUJR", name = "r", descriptor = "I")
    public int field978;

    @OriginalMember(owner = "client!LZZHVUJR", name = "s", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!LZZHVUJR", name = "e", descriptor = "[I")
    public int[] field965;

    @OriginalMember(owner = "client!LZZHVUJR", name = "f", descriptor = "[I")
    public int[] field966;

    @OriginalMember(owner = "client!LZZHVUJR", name = "g", descriptor = "[I")
    private int[] field967;

    @OriginalMember(owner = "client!LZZHVUJR", name = "i", descriptor = "[I")
    public int[] field969;

    @OriginalMember(owner = "client!LZZHVUJR", name = "c", descriptor = "[LLZZHVUJR;")
    public static class33[] field963;

    @OriginalMember(owner = "client!LZZHVUJR", name = "a", descriptor = "(ZLFXNTEMPE;)V")
    public static void method300(boolean arg0, class18 arg1) {
        class50 var2 = new class50(arg1.method212("seq.dat", null), -46859);
        field962 = var2.method390();
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field963 == null) {
            field963 = new class33[field962];
        }
        for (int var4 = 0; var4 < field962; var4++) {
            if (field963[var4] == null) {
                field963[var4] = new class33();
            }
            field963[var4].method302(var2, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!LZZHVUJR", name = "a", descriptor = "(II)I")
    public int method301(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field961 = !this.field961;
        }
        int var3 = this.field967[arg0];
        if (var3 == 0) {
            class44 var4 = class44.method337(this.field965[arg0]);
            if (var4 != null) {
                var3 = this.field967[arg0] = var4.field1097;
            }
        }
        if (var3 == 0) {
            var3 = 1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!LZZHVUJR", name = "a", descriptor = "(LRSWRPCHR;B)V")
    public void method302(class50 arg0, byte arg1) {
        if (arg1 != 46) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg0.method388();
                if (var3 == 0) {
                    if (this.field964 == 0) {
                        this.field964 = 1;
                        this.field965 = new int[1];
                        this.field965[0] = -1;
                        this.field966 = new int[1];
                        this.field966[0] = -1;
                        this.field967 = new int[1];
                        this.field967[0] = -1;
                    }
                    if (this.field975 == -1) {
                        if (this.field969 == null) {
                            this.field975 = 0;
                        } else {
                            this.field975 = 2;
                        }
                    }
                    if (this.field976 == -1) {
                        if (this.field969 != null) {
                            this.field976 = 2;
                            return;
                        }
                        this.field976 = 0;
                        return;
                    }
                    return;
                }
                if (var3 == 1) {
                    this.field964 = arg0.method388();
                    this.field965 = new int[this.field964];
                    this.field966 = new int[this.field964];
                    this.field967 = new int[this.field964];
                    for (int var4 = 0; var4 < this.field964; var4++) {
                        this.field965[var4] = arg0.method390();
                        this.field966[var4] = arg0.method390();
                        if (this.field966[var4] == 65535) {
                            this.field966[var4] = -1;
                        }
                        this.field967[var4] = arg0.method390();
                    }
                } else if (var3 == 2) {
                    this.field968 = arg0.method390();
                } else if (var3 == 3) {
                    int var5 = arg0.method388();
                    this.field969 = new int[var5 + 1];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field969[var6] = arg0.method388();
                    }
                    this.field969[var5] = 9999999;
                } else if (var3 == 4) {
                    this.field970 = true;
                } else if (var3 == 5) {
                    this.field971 = arg0.method388();
                } else if (var3 == 6) {
                    this.field972 = arg0.method390();
                } else if (var3 == 7) {
                    this.field973 = arg0.method390();
                } else if (var3 == 8) {
                    this.field974 = arg0.method388();
                } else if (var3 == 9) {
                    this.field975 = arg0.method388();
                } else if (var3 == 10) {
                    this.field976 = arg0.method388();
                } else if (var3 == 11) {
                    this.field977 = arg0.method388();
                } else if (var3 == 12) {
                    this.field978 = arg0.method393();
                } else {
                    System.out.println("Error unrecognised seq config code: " + var3);
                }
            }
        }
    }
}
