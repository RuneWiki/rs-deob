import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class252 {

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "[S")
    public short[] field4403;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "[Lsb;")
    public class98[] field4413;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "[B")
    public byte[] field4404;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "[I")
    public int[] field4405;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "[S")
    public short[] field4412;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lgj;")
    public static class226 field4406 = new class226(64);

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "Llb;")
    public static class190 field4410 = new class190(64);

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "Lsb;")
    public static class98 field4417 = class47.method368("Suche nach Updates )2 ", 0);

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lsb;")
    public static class98 field4415 = null;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "Z")
    public static boolean field4419 = false;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "Lke;")
    public static class212 field4416;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "Ltg;")
    public static class75 field4414;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)I")
    public final int method1743(int arg0, byte arg1) {
        field4407++;
        if (arg1 <= 2) {
            method1744(36);
        }
        return this.field4404[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method1744(int arg0) {
        field4415 = null;
        field4410 = null;
        if (arg0 == 4) {
            field4406 = null;
            field4417 = null;
            field4416 = null;
            field4414 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)Z")
    public final boolean method1745(byte arg0, int arg1) {
        if (arg0 != -96) {
            this.field4412 = null;
        }
        field4408++;
        return (this.field4404[arg1] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(I)V")
    public class252(int arg0) {
        this.field4409 = arg0;
        this.field4403 = new short[this.field4409];
        this.field4413 = new class98[this.field4409];
        this.field4404 = new byte[this.field4409];
        this.field4405 = new int[this.field4409];
        this.field4412 = new short[this.field4409];
    }
}
