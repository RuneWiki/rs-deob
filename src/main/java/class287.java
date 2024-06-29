import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class287 extends class77 {

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "Z")
    public boolean field4349 = false;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public int field4350 = -1;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "Z")
    public boolean field4352 = false;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4348 = "slide:";

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field4337 = 0;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "Ljava/lang/String;")
    public static String field4345 = "Loaded interfaces";

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public int field4338;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public int field4341;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public int field4342;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public int field4344;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public int field4347;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "Z")
    public static boolean field4353;

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "[[[I")
    public static int[][][] field4340;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 6)
    public static final boolean method2072(int arg0, String arg1) {
        field4339++;
        return arg0 == 8 ? class252.method1852(true, arg0 + 19040, 10, arg1) : true;
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V", line = 21)
    public static void method2073(int arg0) {
        field4340 = (int[][][]) null;
        if (arg0 != 20045) {
            method2073(15);
        }
        field4345 = null;
        field4348 = null;
    }

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "(I)V", line = 34)
    public static final void method2074(int arg0) {
        class119.field1682 = arg0;
        for (int var1 = 0; var1 < class18.field295; var1++) {
            for (int var2 = 0; var2 < class146.field2109; var2++) {
                if (class302.field4502[arg0][var1][var2] == null) {
                    class302.field4502[arg0][var1][var2] = new class167(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V", line = 59)
    public static final void method2075(int arg0, int arg1) {
        field4346++;
        class95 var2 = class227.method1699(8, arg1 ^ 0x9163E960, arg0);
        var2.method743(arg1);
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(II)I", line = 86)
    public static int method2076(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "(I)V", line = 105)
    public static final void method2077(int arg0) {
        field4351++;
        class155.method1121((long) class304.field4560);
        if (class257.field3850 != -1) {
            class73.method603(-126, class257.field3850);
        }
        for (int var1 = 0; var1 < class178.field2558; var1++) {
            if (class332.field5051[var1]) {
                class186.field2674[var1] = true;
            }
            class158.field2276[var1] = class332.field5051[var1];
            class332.field5051[var1] = false;
        }
        if (class141.field2031) {
            class174.field2513 = true;
        }
        class134.field1955 = -1;
        class4.field119 = class304.field4560;
        if (arg0 <= 94) {
            field4345 = (String) null;
        }
        class22.field332 = -1;
        class17.field288 = null;
        if (class257.field3850 != -1) {
            class178.field2558 = 0;
            class167.method1189((byte) 59);
        }
        if (class141.field2031) {
            class205.method1489();
        } else {
            class44.method318();
        }
        class94.field1310 = 0;
    }
}
