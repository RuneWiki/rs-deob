import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class273 extends class9 {

    @OriginalMember(owner = "client!of", name = "kb", descriptor = "Ljava/lang/Object;")
    private Object field4609;

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "Lhi;")
    public static class82 field4601 = class95.method664((byte) -74, "mapdots");

    @OriginalMember(owner = "client!of", name = "hb", descriptor = "Lhi;")
    public static class82 field4606 = class95.method664((byte) -71, "_labels");

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!of", name = "fb", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!of", name = "gb", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!of", name = "jb", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!of", name = "lb", descriptor = "I")
    public static int field4610;

    @OriginalMember(owner = "client!of", name = "mb", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!of", name = "ib", descriptor = "[I")
    public static int[] field4607;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "(I)Z", line = 6)
    public final boolean method61(int arg0) {
        if (arg0 <= 13) {
            field4608 = -117;
        }
        field4600++;
        return false;
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(B)V", line = 17)
    public static final void method1906(byte arg0) {
        class74.field1127.method2168(0);
        if (arg0 == -71) {
            field4596++;
        }
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(B)V", line = 35)
    public static final void method1907(byte arg0) {
        class90.field1630 = null;
        field4603++;
        if (arg0 >= -72) {
            method1911(false);
        }
        class171.field2950 = null;
        class199.field3413 = null;
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V", line = 53)
    public static final void method1908(byte arg0) {
        class74.field1127.method2172(false);
        field4599++;
        int var1 = 66 % ((arg0 - 35) / 43);
    }

    @OriginalMember(owner = "client!of", name = "k", descriptor = "(I)I", line = 65)
    public static final int method1909(int arg0) {
        field4604++;
        if (arg0 != -26358) {
            field4606 = (class82) null;
        }
        if ((double) class119.field2106 == 3.0D) {
            return 37;
        } else if ((double) class119.field2106 == 4.0D) {
            return 50;
        } else if ((double) class119.field2106 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(IB)Z", line = 98)
    public static final boolean method1910(int arg0, byte arg1) {
        field4595++;
        class67 var2 = class44.method329(3283, arg0);
        if (var2 == null) {
            return false;
        } else if (class120.field2113 == 1 || class120.field2113 == 2 || class91.field1640 == 2) {
            byte[] var3 = var2.field1040.method552(false);
            class135.field2339 = new String(var3, 0, var3.length);
            class47.field786 = var2.field1041;
            if (class91.field1640 != 0) {
                class92.field1643 = class47.field786 + 40000;
                class203.field3530 = class47.field786 + 50000;
                class39.field686 = class92.field1643;
            }
            return true;
        } else if (arg1 <= 56) {
            return false;
        } else {
            class82 var4 = class150.field2551;
            if (class91.field1640 != 0) {
                var4 = class29.method182(-6039, new class82[] { class117.field2063, class327.method2240((byte) -74, var2.field1041 + 7000) });
            }
            class82 var5 = class150.field2551;
            if (class159.field2765 != null) {
                var5 = class29.method182(-6039, new class82[] { class21.field295, class159.field2765 });
            }
            class82 var6 = class29.method182(-6039, new class82[] { class45.field768, var2.field1040, var4, class138.field2367, class327.method2240((byte) -74, class53.field856), class247.field4281, class327.method2240((byte) -74, class80.field1361), var5, class296.field5050, class124.field2166 ? class31.field471 : class77.field1322, class165.field2885, class14.field117 ? class31.field471 : class77.field1322, class325.field5579, class48.field802 ? class31.field471 : class77.field1322 });
            try {
                class280.field4704.getAppletContext().showDocument(var6.method556((byte) 97), "_self");
                return true;
            } catch (Exception var8) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 158)
    public final Object method56(int arg0) {
        field4594++;
        int var2 = -102 % ((arg0 + 48) / 57);
        return this.field4609;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V", line = 170)
    public static final void method1911(boolean arg0) {
        field4610++;
        Container var1;
        if (class48.field795 != null) {
            var1 = class48.field795;
        } else if (class261.field4468 == null) {
            var1 = class55.field881.field2109;
        } else {
            var1 = class261.field4468;
        }
        class196.field3337 = var1.getSize().width;
        class166.field2902 = var1.getSize().height;
        if (class261.field4468 == var1) {
            Insets var2 = class261.field4468.getInsets();
            class166.field2902 -= var2.top + var2.bottom;
            class196.field3337 -= var2.right + var2.left;
        }
        if (arg0) {
            return;
        }
        if (class284.method1972((byte) -125) < 2) {
            class48.field798 = 0;
            class260.field4462 = 765;
            class179.field3066 = (class196.field3337 - 765) / 2;
            class180.field3078 = 503;
        } else {
            class179.field3066 = 0;
            class180.field3078 = class166.field2902;
            class48.field798 = 0;
            class260.field4462 = class196.field3337;
        }
        if (class147.field2485) {
            class147.method1017(class260.field4462, class180.field3078);
        }
        class122.field2134.setSize(class260.field4462, class180.field3078);
        if (class261.field4468 == var1) {
            Insets var3 = class261.field4468.getInsets();
            class122.field2134.setLocation(class179.field3066 + var3.left, class48.field798 + var3.top);
        } else {
            class122.field2134.setLocation(class179.field3066, class48.field798);
        }
        if (class255.field4382 != -1) {
            class81.method522(false, true);
        }
        class61.method399(-14358);
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(II)Led;", line = 234)
    public static final class312 method1912(int arg0, int arg1) {
        field4598++;
        class312 var2 = (class312) class306.field5205.method2175((long) arg0, 3008);
        if (var2 != null) {
            return var2;
        }
        if (arg1 > -48) {
            method1910(-49, (byte) 111);
        }
        byte[] var3 = class269.field4549.method1577(class83.method582(arg0, -114), class138.method936(255, arg0), -29569);
        class312 var4 = new class312();
        var4.field5334 = arg0;
        if (var3 != null) {
            var4.method2149(new class153(var3), true);
        }
        var4.method2145(-125);
        if (var4.field5370 != -1) {
            var4.method2140(method1912(var4.field5370, -80), method1912(var4.field5339, -64), (byte) -92);
        }
        if (var4.field5387 != -1) {
            var4.method2136(method1912(var4.field5387, -50), method1912(var4.field5390, -112), 0);
        }
        if (!class144.field2455 && var4.field5340) {
            var4.field5353 = 0;
            var4.field5364 = class177.field3054;
            var4.field5321 = false;
            var4.field5396 = null;
            var4.field5344 = null;
        }
        class306.field5205.method2169(var4, (long) arg0, (byte) 94);
        return var4;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V", line = 280)
    public static void method1913(boolean arg0) {
        if (arg0) {
            field4607 = null;
            field4601 = null;
            field4606 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 291)
    public class273(Object arg0) {
        this.field4609 = arg0;
    }
}
