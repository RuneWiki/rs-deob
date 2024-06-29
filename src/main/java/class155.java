import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class155 extends class396 {

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "Lor;")
    public class382 field2214;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "Lqa;")
    public class134 field2213;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[[B")
    public static byte[][] field2208 = new byte[1000][];

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "[Z")
    public static boolean[] field2207 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field2206 = 10;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "[S")
    public static short[] field2212 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Ljava/lang/String;")
    public static String field2217 = "Loading config - ";

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "[Ldh;")
    public static class175[] field2211;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
    public final void method1025(byte arg0) {
        this.field2210 = this.field2214.field5604;
        this.field2205 = this.field2214.field5610;
        field2216++;
        this.field2204 = this.field2214.field5602;
        if (this.field2214.field5608 != null) {
            this.field2214.field5608.method130(this.field2213.field1879, this.field2213.field1872, this.field2213.field1877, class133.field1849);
        }
        if (arg0 <= 8) {
            this.method1025((byte) 75);
        }
        this.field2215 = class133.field1849[2];
        this.field2209 = class133.field1849[0];
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
    public static void method1026(int arg0) {
        field2217 = null;
        if (arg0 >= -67) {
            method1026(27);
        }
        field2208 = null;
        field2211 = null;
        field2212 = null;
        field2207 = null;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lor;Lpl;)V")
    public class155(class382 arg0, class389 arg1) {
        this.field2214 = arg0;
        this.field2213 = class334.method2146(arg0.field5603, -8239);
        this.method1025((byte) 74);
    }
}
