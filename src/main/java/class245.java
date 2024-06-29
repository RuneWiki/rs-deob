import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public class class245 extends class108 {

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "Ljava/lang/String;")
    public String field3093;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "Z")
    public boolean field3092;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "Z")
    public boolean field3091;

    @OriginalMember(owner = "client!hda", name = "x", descriptor = "Ljava/lang/String;")
    public String field3105;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
    public int field3096;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public int field3100;

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "I")
    public int field3101;

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "J")
    public long field3099;

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "I")
    public static int field3103 = 0;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
    public static int field3098 = 0;

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "Lvt;")
    public static class344 field3102 = new class344("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!hda", name = "w", descriptor = "Lkr;")
    public static class329 field3104;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V")
    public static final void method1513(int arg0, int arg1) {
        class88 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class544 var4 = class50.field672[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class541.field7566; var5++) {
                    for (int var6 = 0; var6 < class260.field3211; var6++) {
                        var2 = var4.method1035(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class400.field5480;
                            int var8 = var5 << class400.field5480;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class544 var10 = class50.field672[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1031(var6, var5) - var10.method1031(var6, var5);
                                    int var12 = var4.method1031(var6 + 1, var5) - var10.method1031(var6 + 1, var5);
                                    int var13 = var4.method1031(var6 + 1, var5 + 1) - var10.method1031(var6 + 1, var5 + 1);
                                    int var14 = var4.method1031(var6, var5 + 1) - var10.method1031(var6, var5 + 1);
                                    var10.method1037(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(I)V")
    public static void method1514(int arg0) {
        if (arg0 != 0) {
            field3103 = 12;
        }
        field3104 = null;
        field3102 = null;
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class245(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field3093 = arg1;
        this.field3092 = arg8;
        this.field3091 = arg9;
        this.field3105 = arg0;
        this.field3096 = arg6;
        this.field3100 = arg4;
        this.field3101 = arg2;
        this.field3097 = arg7;
        this.field3094 = arg3;
        this.field3099 = arg5;
    }
}
