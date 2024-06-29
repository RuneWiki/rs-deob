import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class225 {

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public int field3230;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public int field3227;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Lrn;")
    public class225 field3224;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "Lm;")
    public class163 field3228;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "[[[I")
    public static int[][][] field3221 = new int[2][][];

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public int field3220;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BZ)V")
    public static final void method1440(byte arg0, boolean arg1) {
        class184.method1146(arg0 - 4);
        field3226++;
        if (!class587.method3447(class440.field6254, -28130)) {
            return;
        }
        class531.field7442++;
        if (class531.field7442 < 50 && !arg1) {
            return;
        }
        if (arg0 != -99) {
            method1442(126);
        }
        class531.field7442 = 0;
        if (!class143.field2204 && class143.field2203 != null) {
            class351.method2108(class122.field1986, -10511);
            class23.field333++;
            try {
                class143.field2203.method998(arg0 + 34165, class479.field6754.field138, 0, class479.field6754.field165);
                class479.field6754.field165 = 0;
            } catch (IOException var2) {
                class143.field2204 = true;
            }
        }
        class184.method1146(127);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Lfl;")
    public final class630 method1441(byte arg0) {
        if (arg0 != 32) {
            field3221 = null;
        }
        field3229++;
        return class368.method2207(this.field3230, arg0 ^ 0x5197);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    public static final void method1442(int arg0) {
        if (class566.field7828 == null || class46.field898 == null) {
            class46.field898 = new int[256];
            class566.field7828 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class566.field7828[var1] = (int) (Math.sin(var2) * 4096.0D);
                class46.field898[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 256) {
            method1440((byte) -24, false);
        }
        field3222++;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
    public static void method1443(int arg0) {
        field3221 = null;
        if (arg0 != 2) {
            method1443(80);
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(II)V")
    public class225(int arg0, int arg1) {
        this.field3230 = arg0;
        this.field3227 = arg1;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lrn;I)V")
    public class225(class225 arg0, int arg1) {
        this.field3224 = arg0;
        this.field3227 = this.field3224.field3227 + arg1;
        this.field3228 = this.field3224.field3228;
        this.field3230 = this.field3224.field3230;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)Lrn;")
    public final class225 method1444(int arg0, byte arg1) {
        if (arg1 != -40) {
            this.method1444(60, (byte) 103);
        }
        field3219++;
        return new class225(this.field3230, arg0);
    }
}
