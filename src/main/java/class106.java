import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class106 extends class145 {

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1894 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field1895 = 3;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field1896 = 0;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field1893;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)I", line = 8)
    public static final int method750(int arg0) {
        if (arg0 != 13744) {
            return -63;
        }
        field1892++;
        if (class167.field2951) {
            return 0;
        } else if (class216.method1512(128)) {
            return class85.field1537 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V", line = 38)
    public static void method751(int arg0) {
        field1894 = null;
        if (arg0 != 25914) {
            method751(-111);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 48)
    public static final void method752(byte arg0) {
        field1893++;
        class68.method521((byte) 33);
        class284.method1992(-113);
        class172.method1251((byte) -123);
        class214.method1502(0);
        class30.method215(24130);
        class214.method1501(-95);
        class114.method784(40);
        class290.method2015(0);
        class157.method1164(-11159);
        class308.method2143((byte) -64);
        class112.method774(-26251);
        class31.method224(-127);
        class241.method1613(32105);
        if (class175.field3103 != 0) {
            for (int var1 = 0; var1 < class79.field1475.length; var1++) {
                class79.field1475[var1] = null;
            }
            class71.field1302 = 0;
        }
        class192.method1396(381251297);
        class172.method1248(false);
        class40.field719.method2076(100);
        if (!class253.field4323) {
            ((class27) class136.field2373).method180((byte) -49);
        }
        class45.field841.method1261(-1);
        class216.field3851.method1007((byte) -66);
        class185.field3258.method1007((byte) 92);
        class166.field2939.method1007((byte) -120);
        class96.field1702.method1007((byte) 90);
        class246.field4184.method1007((byte) 90);
        class21.field277.method1007((byte) -97);
        class297.field5141.method1007((byte) -94);
        class153.field2743.method1007((byte) -115);
        class240.field4094.method1007((byte) 81);
        if (arg0 >= -1) {
            field1896 = -34;
        }
        class80.field1488.method1007((byte) 94);
        class73.field1336.method1007((byte) 76);
        class76.field1446.method2076(115);
    }
}
