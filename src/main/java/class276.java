import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public abstract class class276 extends class330 {

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "Z")
    public boolean field3890 = false;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Z")
    public boolean field3887 = false;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public int field3892;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public int field3894;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "I")
    public int field3889;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "F")
    public static float field3893 = 0.0F;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V")
    public static final void method1742(byte arg0) {
        field3891++;
        class331 var1 = class39.field403;
        synchronized (class39.field403) {
            if (arg0 != 14) {
                field3893 = -0.9062683F;
            }
            class39.field403.method2043(-115);
        }
        class331 var2 = client.field2307;
        synchronized (client.field2307) {
            client.field2307.method2043(arg0 ^ 0xFFFFFFBC);
        }
        class331 var3 = class193.field2629;
        synchronized (class193.field2629) {
            class193.field2629.method2043(-49);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBIII)V")
    public static final void method1743(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3886++;
        class348 var5 = class385.method2464(10, 1302, arg3);
        var5.method2216((byte) 23);
        var5.field5094 = arg2;
        var5.field5093 = arg0;
        var5.field5091 = arg4;
        int var6 = -56 % ((arg1 - 39) / 35);
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIZZ)V")
    public class276(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field3892 = arg0;
        this.field3894 = arg2;
        this.field3887 = arg4;
        this.field3890 = arg3;
        this.field3889 = arg1;
    }
}
