import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public abstract class class116 {

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public static int field1888 = 100;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Lja;")
    public static class64 field1892;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field1889;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 7)
    public static final void method867(int arg0) {
        field1890++;
        class51.method383(0);
        class118.method876(-128);
        class53.method391((byte) 29);
        class17.method141(arg0 ^ 0x6F);
        class223.method1625(arg0 ^ 0xFFFFF622);
        class288.method2027((byte) 103);
        class294.method2064((byte) -105);
        class33.method235(33);
        class162.method1203(true);
        class90.method647(-7833);
        class111.method848(2048);
        class311.method2151(-1);
        class139.method1066((byte) -42);
        class125.method942(-106);
        class36.method270(false);
        class4.method9(true);
        if (class77.field1172 != 0) {
            for (int var1 = 0; var1 < class215.field3422.length; var1++) {
                class215.field3422[var1] = null;
            }
            class34.field571 = 0;
        }
        class25.method170(arg0);
        class63.method454(arg0 + 116);
        class88.field1355.method1837(91);
        if (!class265.field4126) {
            ((class203) class174.field2734).method1472(arg0 ^ 0x5B);
        }
        class160.field2516.method2019((byte) 114);
        class137.field2175.method482(-38);
        class224.field3604.method482(-79);
        class115.field1881.method482(-105);
        class285.field4372.method482(-123);
        class224.field3602.method482(-125);
        class111.field1842.method482(-44);
        class55.field878.method482(-89);
        class210.field3356.method482(-99);
        class206.field3262.method482(-103);
        class207.field3272.method482(arg0 ^ 0xFFFFFFD9);
        class178.field2787.method482(-34);
        class196.field3117.method1837(-124);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III[B)I", line = 72)
    public static final int method869(int arg0, int arg1, int arg2, byte[] arg3) {
        int var4 = -1;
        for (int var5 = arg2; var5 < arg1; var5++) {
            var4 = class18.field350[(arg3[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        if (arg0 != 870622600) {
            method870(31);
        }
        field1893++;
        return ~var4;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 97)
    public static void method870(int arg0) {
        field1892 = null;
        if (arg0 != 255) {
            method869(51, 6, -64, (byte[]) null);
        }
        field1889 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lwd;I)Lwd;")
    public abstract class81 method868(class81 arg0, int arg1);
}
