import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public abstract class class488 {

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "[F")
    public float[] field7145 = new float[5000];

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public int field7143 = 0;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "[B")
    public byte[] field7148 = new byte[5000];

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public int field7147 = 0;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "[Ljava/lang/Object;")
    public Object[] field7144 = new Object[5000];

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public volatile int field7149 = 0;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public volatile int field7146 = 0;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "Lqs;")
    public static class496 field7142;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V", line = 4)
    public static void method2851(int arg0) {
        field7142 = null;
        if (arg0 > -59) {
            method2851(-76);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)V")
    public abstract void method2208(byte arg0);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(B)V")
    public abstract void method2207(byte arg0);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILut;)V")
    public abstract void method2200(int arg0, class465 arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lya;IZFI)V")
    public abstract void method2204(class220 arg0, int arg1, boolean arg2, float arg3, int arg4);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lut;I)V")
    public abstract void method2206(class465 arg0, int arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IB)V")
    public abstract void method2209(int arg0, byte arg1);

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(ILut;)V")
    public abstract void method2201(int arg0, class465 arg1);

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)V")
    public abstract void method2205(int arg0, int arg1);
}
