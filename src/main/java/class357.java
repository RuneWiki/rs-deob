import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tda")
public class class357 {

    @OriginalMember(owner = "client!tda", name = "g", descriptor = "I")
    private int field4355 = -1;

    @OriginalMember(owner = "client!tda", name = "n", descriptor = "I")
    private int field4362 = 0;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "Lfca;")
    private class661 field4349 = new class661();

    @OriginalMember(owner = "client!tda", name = "p", descriptor = "Z")
    public boolean field4364 = false;

    @OriginalMember(owner = "client!tda", name = "k", descriptor = "I")
    private int field4359;

    @OriginalMember(owner = "client!tda", name = "i", descriptor = "I")
    private int field4357;

    @OriginalMember(owner = "client!tda", name = "m", descriptor = "[Lgga;")
    private class237[] field4361;

    @OriginalMember(owner = "client!tda", name = "j", descriptor = "[[I")
    private int[][] field4358;

    @OriginalMember(owner = "client!tda", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4353 = null;

    @OriginalMember(owner = "client!tda", name = "c", descriptor = "[I")
    public static int[] field4351 = new int[14];

    @OriginalMember(owner = "client!tda", name = "h", descriptor = "Lfca;")
    public static class661 field4356 = new class661();

    @OriginalMember(owner = "client!tda", name = "q", descriptor = "I")
    public static int field4365 = 0;

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!tda", name = "d", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!tda", name = "f", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!tda", name = "l", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!tda", name = "o", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
    public final void method2052(int arg0) {
        field4354++;
        for (int var2 = 0; var2 < this.field4357; var2++) {
            this.field4358[var2] = null;
        }
        this.field4361 = null;
        this.field4358 = null;
        this.field4349.method3594(-58);
        this.field4349 = null;
        if (arg0 > -99) {
            this.method2054(-82, -97);
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(B)[[I")
    public final int[][] method2053(byte arg0) {
        field4350++;
        if (this.field4359 != this.field4357) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0 == -112) {
            for (int var2 = 0; var2 < this.field4357; var2++) {
                this.field4361[var2] = class31.field311;
            }
            return this.field4358;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(II)[I")
    public final int[] method2054(int arg0, int arg1) {
        if (arg1 != 9986) {
            this.method2052(63);
        }
        field4352++;
        if (this.field4359 == this.field4357) {
            this.field4364 = this.field4361[arg0] == null;
            this.field4361[arg0] = class31.field311;
            return this.field4358[arg0];
        } else if (this.field4357 == 1) {
            this.field4364 = this.field4355 != arg0;
            this.field4355 = arg0;
            return this.field4358[0];
        } else {
            class237 var3 = this.field4361[arg0];
            if (var3 == null) {
                this.field4364 = true;
                if (this.field4362 >= this.field4357) {
                    class237 var4 = (class237) this.field4349.method3604(arg1 ^ 0xFFFFD8C6);
                    var3 = new class237(arg0, var4.field3229);
                    this.field4361[var4.field3230] = null;
                    var4.method1946(-10364);
                } else {
                    var3 = new class237(arg0, this.field4362);
                    this.field4362++;
                }
                this.field4361[arg0] = var3;
            } else {
                this.field4364 = false;
            }
            this.field4349.method3598(var3, true);
            return this.field4358[var3.field3229];
        }
    }

    @OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V")
    public static void method2055(byte arg0) {
        field4356 = null;
        field4353 = null;
        int var1 = 114 % ((arg0 + 23) / 36);
        field4351 = null;
    }

    @OriginalMember(owner = "client!tda", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V")
    public static final void method2056(String arg0, String arg1, int arg2, int arg3, String arg4, String arg5, String arg6, int arg7, int arg8) {
        field4360++;
        class446 var9 = class438.field5762[99];
        for (int var10 = 99; var10 > 0; var10--) {
            class438.field5762[var10] = class438.field5762[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class446(arg8, arg2, arg6, arg5, arg0, arg4, arg7, arg1);
        } else {
            var9.method2552(arg1, arg4, arg8, arg5, arg2, 27932, arg6, arg0, arg7);
        }
        class72.field983 = class518.field6597;
        class138.field1827++;
        class438.field5762[arg3] = var9;
    }

    @OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(III)V")
    public class357(int arg0, int arg1, int arg2) {
        this.field4359 = arg1;
        this.field4357 = arg0;
        this.field4361 = new class237[this.field4359];
        this.field4358 = new int[this.field4357][arg2];
    }
}
