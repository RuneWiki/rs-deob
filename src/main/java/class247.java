import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class247 {

    @OriginalMember(owner = "client!oca", name = "d", descriptor = "I")
    public int field3181 = class462.method2533(false);

    @OriginalMember(owner = "client!oca", name = "l", descriptor = "I")
    public int field3189;

    @OriginalMember(owner = "client!oca", name = "h", descriptor = "Ljava/lang/String;")
    public String field3185;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "I")
    public int field3178;

    @OriginalMember(owner = "client!oca", name = "e", descriptor = "Ljava/lang/String;")
    public String field3182;

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "Ljava/lang/String;")
    public String field3183;

    @OriginalMember(owner = "client!oca", name = "k", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "Ljava/lang/String;")
    public String field3179;

    @OriginalMember(owner = "client!oca", name = "g", descriptor = "Ljava/lang/String;")
    public String field3184;

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!oca", name = "j", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V")
    public static final void method1478(byte arg0) {
        field3180++;
        if (class135.field1639) {
            return;
        }
        if (class611.field8310.field8695) {
            class23.field266 = ((int) class23.field266 + 47 & 0xFFFFFFF0);
        } else {
            class441.field5547 += (12.0F - class441.field5547) / 2.0F;
        }
        class531.field6707 = true;
        class135.field1639 = true;
        if (arg0 <= -83) {
            ;
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(II)V")
    public static final void method1479(int arg0, int arg1) {
        class279 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class140 var4 = class252.field3250[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class36.field538; var5++) {
                    for (int var6 = 0; var6 < class546.field6871; var6++) {
                        var2 = var4.method199(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class480.field5972;
                            int var8 = var5 << class480.field5972;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class140 var10 = class252.field3250[var9];
                                if (var10 != null) {
                                    int var11 = var4.method201(var6, var5) - var10.method201(var6, var5);
                                    int var12 = var4.method201(var6 + 1, var5) - var10.method201(var6 + 1, var5);
                                    int var13 = var4.method201(var6 + 1, var5 + 1) - var10.method201(var6 + 1, var5 + 1);
                                    int var14 = var4.method201(var6, var5 + 1) - var10.method201(var6, var5 + 1);
                                    var10.method197(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(Ljava/lang/String;IZILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public final void method1480(String arg0, int arg1, boolean arg2, int arg3, String arg4, int arg5, String arg6, String arg7, String arg8) {
        field3187++;
        this.field3181 = class462.method2533(false);
        this.field3188 = arg3;
        this.field3189 = arg1;
        this.field3184 = arg7;
        this.field3183 = arg8;
        this.field3179 = arg4;
        this.field3186 = class665.field9027;
        this.field3178 = arg5;
        this.field3182 = arg0;
        this.field3185 = arg6;
        if (!arg2) {
            this.method1480(null, 80, true, 114, null, -126, null, null, null);
        }
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class247(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field3189 = arg6;
        this.field3185 = arg7;
        this.field3178 = arg1;
        this.field3182 = arg5;
        this.field3183 = arg4;
        this.field3188 = arg0;
        this.field3186 = class665.field9027;
        this.field3179 = arg3;
        this.field3184 = arg2;
    }
}
