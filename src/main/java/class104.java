import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class104 extends class589 {

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "[I")
    public static int[] field1482 = new int[13];

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
    public static int field1484;

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "Lfq;")
    public class214 field1478;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "Z")
    public boolean field1483;

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "[Lju;")
    public class136[] field1479;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Laf;B)V", line = 4)
    public static final void method796(class459 arg0, byte arg1) {
        field1480++;
        arg0.method1686(arg1 - 152, class348.field5051.method1157((byte) -89));
        arg0.method1686(arg1 + 83, class133.field1820.method1157((byte) 107));
        arg0.method1686(79, class677.field9085.method1157((byte) -127));
        arg0.method1686(arg1 ^ 0xFFFFFFEB, class548.field7565.method1157((byte) -71));
        arg0.method1686(arg1 - 89, class54.field643.method1157((byte) -121));
        arg0.method1686(-60, class577.field7862.method1157((byte) -34));
        arg0.method1686(-119, class66.field917.method1157((byte) 122));
        arg0.method1686(-62, class768.field10581.method1157((byte) -64));
        if (arg1 != 39) {
            field1482 = null;
        }
        arg0.method1686(-48, class490.field6826.method1157((byte) -49));
        arg0.method1686(-105, class444.field6395.method1157((byte) 9));
        arg0.method1686(arg1 - 88, class333.field4720.method1157((byte) 113));
        arg0.method1686(-62, class560.field7680.method1157((byte) -11));
        arg0.method1686(-86, class235.field3135.method1157((byte) -2));
        arg0.method1686(-47, class410.field5827.method1157((byte) 123));
        arg0.method1686(-82, class8.field74.method1157((byte) -81));
        arg0.method1686(56, class466.field6600.method1157((byte) 124));
        arg0.method1686(90, class415.field5995.method1157((byte) -75));
        arg0.method1686(arg1 - 159, class187.field2451.method1157((byte) 104));
        arg0.method1686(55, class204.field2634.method1157((byte) 124));
        arg0.method1686(63, class16.field162.method1157((byte) 108));
        arg0.method1686(64, class755.field10224.method1157((byte) -68));
        arg0.method1686(107, class291.field4154.method1157((byte) 115));
        arg0.method1686(arg1 + 23, class623.field8412.method1157((byte) 126));
        arg0.method1686(-127, class627.field8494.method1157((byte) 120));
        arg0.method1686(-109, class304.field4329.method1157((byte) -118));
        arg0.method1686(-115, class73.field992.method1157((byte) -62));
        arg0.method1686(106, class737.field10006.method1157((byte) -62));
        arg0.method1686(-101, class384.field5579.method1157((byte) 109));
        arg0.method1686(60, class382.field5556.method1157((byte) -10));
        arg0.method1686(arg1, class677.field9086.method1157((byte) 0));
        arg0.method1686(-55, class122.field1688.method1157((byte) 123));
        arg0.method1686(116, class270.field3942.method1157((byte) -120));
        arg0.method1686(-94, class649.method3607(-1));
        arg0.method1686(arg1 ^ 0xFFFFFFA6, class183.method1241((byte) 95));
        arg0.method1686(-122, class734.field9951.method1157((byte) 113));
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 49)
    public static void method797(int arg0) {
        field1482 = null;
        if (arg0 > -91) {
            field1482 = null;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIBLha;)Z", line = 63)
    public final boolean method798(int arg0, int arg1, byte arg2, class66 arg3) {
        field1481++;
        int var5 = this.field1478.method117((byte) 120);
        if (arg2 != 106) {
            field1485 = 105;
        }
        if (this.field1479 != null) {
            for (int var6 = 0; var6 < this.field1479.length; var6++) {
                this.field1479[var6].field1845 <<= var5;
                if (this.field1479[var6].method949(arg0, arg1) && this.field1478.method122(arg0, arg3, 6238, arg1)) {
                    this.field1479[var6].field1845 >>= var5;
                    return true;
                }
                this.field1479[var6].field1845 >>= var5;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZLofa;I)V", line = 106)
    public static final void method799(boolean arg0, class347 arg1, int arg2) {
        field1484++;
        int var3 = arg1.field4946 == 0 ? arg1.field4986 : arg1.field4946;
        int var4 = ~arg1.field4978 == arg2 ? arg1.field4940 : arg1.field4978;
        class358.method2272(class419.field6032[arg1.field5003 >> 16], arg0, (byte) -79, var3, arg1.field5003, var4);
        if (arg1.field4928 != null) {
            class358.method2272(arg1.field4928, arg0, (byte) -79, var3, arg1.field5003, var4);
        }
        class73 var5 = (class73) class355.field5178.method1248(92, (long) arg1.field5003);
        if (var5 != null) {
            class651.method3618(var3, var5.field985, var4, 126, arg0);
        }
    }
}
