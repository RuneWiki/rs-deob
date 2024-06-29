import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class322 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field5499;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Lck;")
    public static class275 field5501;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[[B")
    public static byte[][] field5502;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)V", line = 5)
    public static void method2234(boolean arg0) {
        field5502 = (byte[][]) null;
        if (arg0) {
            method2236(true, -72);
        }
        field5501 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)V", line = 25)
    public static final void method2235(int arg0, int arg1, int arg2) {
        field5498++;
        class176 var3 = class78.method557(arg2, (byte) -14);
        int var4 = var3.field3105;
        int var5 = var3.field3108;
        if (arg1 != -26374) {
            field5501 = (class275) null;
        }
        int var6 = var3.field3102;
        int var7 = class266.field4498[var6 - var5];
        if (arg0 < 0 || var7 < arg0) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class287.method1910(var4, -9554, ~var8 & class138.field2462[var4] | var8 & arg0 << var5);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)V", line = 50)
    public static final void method2236(boolean arg0, int arg1) {
        class48.field748 = (byte[][][]) null;
        class300.field4972 = null;
        class264.field4400 = (byte[][][]) null;
        class1.field10 = (byte[][][]) null;
        class260.field4361 = (byte[][][]) null;
        class300.field4975 = arg1;
        class13.field183 = (short[][][]) null;
        class307.field5192 = null;
        class64.field1079 = (int[][][]) null;
        class283.field4710 = (int[][][]) null;
        field5499++;
        class273.field4599 = (byte[][][]) null;
        if (arg0 && class134.field2320 != null) {
            class217.field3648 = class134.field2320.field3859;
        } else {
            class217.field3648 = null;
        }
        class134.field2320 = null;
        class7.field84.method905((byte) 92);
        class55.field829 = null;
        class100.field1624 = -1;
        class55.field833 = null;
        class294.field4898 = null;
        class228.field3844 = null;
        class318.field5449 = null;
        class202.field3456 = null;
        class289.field4797 = null;
        client.field2076 = null;
        class134.field2335 = -1;
        class228.field3852 = null;
        class159.field2864 = null;
        class39.field630 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lce;B)V", line = 91)
    public static final void method2237(class126 arg0, byte arg1) {
        field5497++;
        if (class159.field2865 == null) {
            return;
        }
        int var2 = -14 / ((arg1 + 44) / 61);
        int var3 = 0;
        long var4 = arg0.method845((byte) -123);
        if (var4 == 0L) {
            return;
        }
        while (class159.field2865.length > var3 && class159.field2865[var3].field1117 != var4) {
            var3++;
        }
        if (class159.field2865.length > var3 && class159.field2865[var3] != null) {
            class103.field1645.method1238(111, 114);
            class103.field1645.method962(-123, class159.field2865[var3].field1117);
            class137.field2417++;
        }
    }
}
