import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MIIGCDHS")
public class class35 {

    @OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "Z")
    private boolean field982 = true;

    @OriginalMember(owner = "client!MIIGCDHS", name = "b", descriptor = "I")
    private int field983 = 7;

    @OriginalMember(owner = "client!MIIGCDHS", name = "f", descriptor = "I")
    public int field987 = -1;

    @OriginalMember(owner = "client!MIIGCDHS", name = "h", descriptor = "[I")
    public int[] field989 = new int[6];

    @OriginalMember(owner = "client!MIIGCDHS", name = "i", descriptor = "[I")
    public int[] field990 = new int[6];

    @OriginalMember(owner = "client!MIIGCDHS", name = "j", descriptor = "[I")
    public int[] field991 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!MIIGCDHS", name = "k", descriptor = "Z")
    public boolean field992 = false;

    @OriginalMember(owner = "client!MIIGCDHS", name = "c", descriptor = "I")
    private int field984;

    @OriginalMember(owner = "client!MIIGCDHS", name = "d", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!MIIGCDHS", name = "g", descriptor = "[I")
    public int[] field988;

    @OriginalMember(owner = "client!MIIGCDHS", name = "e", descriptor = "[LMIIGCDHS;")
    public static class35[] field986;

    @OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "(ZLFXNTEMPE;)V")
    public static void method303(boolean arg0, class18 arg1) {
        class50 var2 = new class50(arg1.method212("idk.dat", null), -46859);
        field985 = var2.method390();
        if (!arg0) {
            return;
        }
        if (field986 == null) {
            field986 = new class35[field985];
        }
        for (int var3 = 0; var3 < field985; var3++) {
            if (field986[var3] == null) {
                field986[var3] = new class35();
            }
            field986[var3].method304(var2, (byte) 46);
        }
    }

    @OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "(LRSWRPCHR;B)V")
    public void method304(class50 arg0, byte arg1) {
        if (arg1 != 46) {
            this.field984 = 45;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method388();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field987 = arg0.method388();
                } else if (var3 == 2) {
                    int var4 = arg0.method388();
                    this.field988 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field988[var5] = arg0.method390();
                    }
                } else if (var3 == 3) {
                    this.field992 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field989[var3 - 40] = arg0.method390();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field990[var3 - 50] = arg0.method390();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field991[var3 - 60] = arg0.method390();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "(I)Z")
    public boolean method305(int arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        } else if (this.field988 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field988.length; var3++) {
                if (!class61.method467(this.field988[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!MIIGCDHS", name = "a", descriptor = "(Z)LWRJMHIDY;")
    public class61 method306(boolean arg0) {
        if (arg0) {
            this.field984 = 21;
        }
        if (this.field988 == null) {
            return null;
        }
        class61[] var2 = new class61[this.field988.length];
        for (int var3 = 0; var3 < this.field988.length; var3++) {
            var2[var3] = class61.method466(this.field988[var3]);
        }
        class61 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class61(var2, var2.length, this.field982);
        }
        for (int var5 = 0; var5 < 6 && this.field989[var5] != 0; var5++) {
            var4.method480(this.field989[var5], this.field990[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "client!MIIGCDHS", name = "b", descriptor = "(I)Z")
    public boolean method307(int arg0) {
        boolean var2 = true;
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field991[var3] != -1 && !class61.method467(this.field991[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!MIIGCDHS", name = "c", descriptor = "(I)LWRJMHIDY;")
    public class61 method308(int arg0) {
        class61[] var2 = new class61[5];
        int var3 = 0;
        if (arg0 >= 0) {
            this.field983 = 117;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field991[var4] != -1) {
                var2[var3++] = class61.method466(this.field991[var4]);
            }
        }
        class61 var5 = new class61(var2, var3, this.field982);
        for (int var6 = 0; var6 < 6 && this.field989[var6] != 0; var6++) {
            var5.method480(this.field989[var6], this.field990[var6]);
        }
        return var5;
    }
}
