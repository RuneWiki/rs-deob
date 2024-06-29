import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class2 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    public int field17;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([[BLtf;B)V")
    public static final void method7(byte[][] arg0, class245 arg1, byte arg2) {
        field13++;
        int var3 = class175.field2217.length;
        if (arg2 != 33) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class611.field8607[var4] >> 8) * 64 - class444.field6151;
                int var7 = (class611.field8607[var4] & 0xFF) * 64 - class236.field3535;
                class482.method2865(23105);
                arg1.method1639(client.field1305, true, var7, var6, var5, class111.field1332);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static final void method8(int arg0) {
        if (arg0 != -16711936) {
            return;
        }
        field16++;
        if (class122.field1614 < 0) {
            return;
        }
        long var1 = class683.method3903((byte) 4);
        class122.field1614 = (int) ((long) class122.field1614 - (var1 - class475.field6593));
        if (class122.field1614 <= 0) {
            class311.field4472 = class223.field3172.field10751;
            class742.field10229 = class223.field3172.field10755;
            class531.field7310 = class223.field3172.field10741;
            class254.field3763 = class223.field3172.field10742;
            class554.field7677 = class223.field3172.field10757;
            class56.field664 = class223.field3172.field10756;
            class122.field1614 = -1;
            class181.field2289 = class223.field3172.field10743;
            class172.field2186 = class223.field3172.field10749;
            class268.field3886 = class223.field3172.field10745;
            class339.field4916 = class223.field3172.field10747;
        } else {
            int var3 = (class122.field1614 << 8) / class77.field863;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            float var6 = 1.0F - var5;
            class268.field3886 = ((class434.field6021 & 0xFF00) * var3 + ((class223.field3172.field10745 & 0xFF00) * var4) & 0xFF0000) + ((class434.field6021 & 0xFF00FF) * var3 + (class223.field3172.field10745 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            class742.field10229 = (class223.field3172.field10755 - class695.field9698) * var6 + class695.field9698;
            class339.field4916 = (class223.field3172.field10747 - class735.field10131) * var6 + class735.field10131;
            class311.field4472 = (class223.field3172.field10751 - class294.field4310) * var6 + class294.field4310;
            class172.field2186 = class540.field7469 * var3 + class223.field3172.field10749 * var4 >> 8;
            class531.field7310 = (class223.field3172.field10741 - class165.field2110) * var6 + class165.field2110;
            class181.field2289 = (class223.field3172.field10743 - class304.field4415) * var6 + class304.field4415;
            class254.field3763 = (class223.field3172.field10742 - class462.field6463) * var6 + class462.field6463;
            class56.field664 = ((class497.field6822 & 0xFF00) * var3 + ((class223.field3172.field10756 & 0xFF00) * var4) & 0xFF0000) + ((class497.field6822 & 0xFF00FF) * var3 + (class223.field3172.field10756 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            if (class104.field1197 != class223.field3172.field10757) {
                class554.field7677 = client.field1307.method209(class104.field1197, class223.field3172.field10757, var6, class554.field7677);
            }
        }
        class475.field6593 = var1;
    }

    @OriginalMember(owner = "client!pb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field12++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method9(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field15++;
            return (arg1 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
    public class2(int arg0) {
        this.field17 = arg0;
    }
}
