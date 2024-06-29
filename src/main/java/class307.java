import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class307 extends class223 {

    @OriginalMember(owner = "client!bn", name = "D", descriptor = "I")
    public int field4362 = 0;

    @OriginalMember(owner = "client!bn", name = "s", descriptor = "Lib;")
    public static class106 field4351 = new class106(16);

    @OriginalMember(owner = "client!bn", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4365 = null;

    @OriginalMember(owner = "client!bn", name = "l", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!bn", name = "n", descriptor = "I")
    public int field4346;

    @OriginalMember(owner = "client!bn", name = "r", descriptor = "I")
    public int field4350;

    @OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
    public int field4353;

    @OriginalMember(owner = "client!bn", name = "v", descriptor = "I")
    public int field4354;

    @OriginalMember(owner = "client!bn", name = "x", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!bn", name = "y", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!bn", name = "z", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!bn", name = "B", descriptor = "I")
    public int field4360;

    @OriginalMember(owner = "client!bn", name = "C", descriptor = "I")
    public int field4361;

    @OriginalMember(owner = "client!bn", name = "E", descriptor = "I")
    public int field4363;

    @OriginalMember(owner = "client!bn", name = "F", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!bn", name = "p", descriptor = "Lqo;")
    public class19 field4348;

    @OriginalMember(owner = "client!bn", name = "I", descriptor = "Lqo;")
    public class19 field4367;

    @OriginalMember(owner = "client!bn", name = "m", descriptor = "Lrd;")
    public class222 field4345;

    @OriginalMember(owner = "client!bn", name = "H", descriptor = "Lgt;")
    public static class316 field4366;

    @OriginalMember(owner = "client!bn", name = "w", descriptor = "Llh;")
    public class364 field4355;

    @OriginalMember(owner = "client!bn", name = "q", descriptor = "Lrs;")
    public class461 field4349;

    @OriginalMember(owner = "client!bn", name = "o", descriptor = "Z")
    public boolean field4347;

    @OriginalMember(owner = "client!bn", name = "t", descriptor = "[I")
    public int[] field4352;

    @OriginalMember(owner = "client!bn", name = "A", descriptor = "[[B")
    public static byte[][] field4359;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 9)
    public final void method1903(int arg0) {
        field4357++;
        int var2 = this.field4356;
        if (this.field4345 != null) {
            class222 var5 = this.field4345.method1509(class253.field3739, (byte) -108);
            if (var5 == null) {
                this.field4356 = -1;
                this.field4361 = 0;
                this.field4363 = 0;
                this.field4352 = null;
                this.field4344 = 0;
                this.field4364 = 0;
            } else {
                this.field4361 = var5.field3188;
                this.field4352 = var5.field3215;
                this.field4364 = var5.field3256;
                this.field4356 = var5.field3213;
                this.field4344 = var5.field3264 << 7;
                this.field4363 = var5.field3255;
            }
        } else if (this.field4349 != null) {
            int var3 = class49.method494((byte) -26, this.field4349);
            if (var2 != var3) {
                this.field4356 = var3;
                class100 var4 = this.field4349.field6790;
                if (var4.field1364 != null) {
                    var4 = var4.method848(false, class253.field3739);
                }
                if (var4 == null) {
                    this.field4361 = this.field4344 = 0;
                } else {
                    this.field4361 = var4.field1399;
                    this.field4344 = var4.field1408 << 7;
                }
            }
        } else if (this.field4355 != null) {
            this.field4356 = class75.method707((byte) -106, this.field4355);
            this.field4361 = this.field4355.field5099;
            this.field4344 = this.field4355.field5080 << 7;
        }
        if (arg0 != -2212) {
            this.method1903(113);
        }
        if (this.field4356 != var2 && this.field4367 != null) {
            class273.field4030.method1242(this.field4367);
            this.field4367 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V", line = 94)
    public static void method1904(boolean arg0) {
        if (arg0) {
            field4359 = null;
        }
        field4351 = null;
        field4359 = null;
        field4366 = null;
        field4365 = null;
    }
}
