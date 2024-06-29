import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class136 extends class266 {

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "Z")
    public static boolean field2011 = false;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "J")
    public static long field2016 = 0L;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field2015 = 0;

    @OriginalMember(owner = "client!sc", name = "E", descriptor = "Lma;")
    public static class5 field2010 = class12.method119("cookiehost", (byte) 101);

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "Lma;")
    public static class5 field2014 = class12.method119(")1p", (byte) 105);

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "Lma;")
    public static class5 field2022 = class12.method119("mem=", (byte) 96);

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "Lma;")
    public static class5 field2023 = class12.method119("Zugewiesener Speicher)3", (byte) 52);

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field2024 = 0;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "Lma;")
    public static class5 field2008 = class12.method119("Konfig geladen)3", (byte) 116);

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "B")
    public byte field2009;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public int field2019;

    @OriginalMember(owner = "client!sc", name = "O", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "Lje;")
    public class158 field2013;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "[Lma;")
    public static class5[] field2012;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(JZ)V", line = 4)
    public static final void method886(long arg0, boolean arg1) {
        field2020++;
        if (arg0 == 0L) {
            return;
        }
        if (class100.field1484 >= 100) {
            class69.method497(24077, class250.field4145, 0, class202.field3214);
            return;
        }
        class5 var3 = class245.method1719(arg0, (byte) -45).method30(-113);
        for (int var4 = 0; var4 < class100.field1484; var4++) {
            if (class202.field3226[var4] == arg0) {
                class69.method497(24077, class250.field4145, 0, class288.method1940((byte) 78, new class5[] { var3, class276.field4708 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class275.field4698; var5++) {
            if (class168.field2565[var5] == arg0) {
                class69.method497(24077, class250.field4145, 0, class288.method1940((byte) 87, new class5[] { class213.field3390, var3, class202.field3227 }));
                return;
            }
        }
        if (var3.method62(class151.field2183.field1367, -23269)) {
            class69.method497(24077, class250.field4145, 0, class19.field325);
            return;
        }
        class202.field3226[class100.field1484] = arg0;
        class153.field2239[class100.field1484++] = class245.method1719(arg0, (byte) -45);
        class228.field3777 = class303.field5107;
        class51.field816++;
        class147.field2127.method1389((byte) -29, 174);
        class147.field2127.method1548(arg1, arg0);
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V", line = 80)
    public static void method887(int arg0) {
        field2012 = null;
        field2014 = null;
        field2008 = null;
        if (arg0 <= 85) {
            field2011 = true;
        }
        field2022 = null;
        field2010 = null;
        field2023 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)V", line = 95)
    public static final void method888(int arg0, int arg1) {
        if (arg0 != 20507) {
            method886(48L, false);
        }
        class182.field2774.method517(false, arg1);
        field2021++;
        class208.field3294.method517(false, arg1);
        class238.field3928.method517(false, arg1);
    }
}
