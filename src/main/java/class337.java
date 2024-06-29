import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public abstract class class337 {

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public volatile int field5145 = 0;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public int field5147 = 0;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "[F")
    public float[] field5141 = new float[5000];

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "[B")
    public byte[] field5150 = new byte[5000];

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public volatile int field5149 = 0;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "[Ljava/lang/Object;")
    public Object[] field5151 = new Object[5000];

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public int field5143 = 0;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field5142 = 0;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field5144 = 0;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "I")
    public static int field5148 = -1;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
    public static int field5152;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lkf;I)V")
    public abstract void method2204(class165 arg0, int arg1);

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(Lkf;I)V")
    public abstract void method2205(class165 arg0, int arg1);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZFBLna;I)V")
    public abstract void method2206(boolean arg0, float arg1, byte arg2, class35 arg3, int arg4);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZI)V")
    public abstract void method2207(boolean arg0, int arg1);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IZ)V")
    public abstract void method2208(int arg0, boolean arg1);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V")
    public abstract void method2209(byte arg0);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V")
    public static final void method2210(int arg0, int arg1) {
        field5152++;
        if (arg0 == 0) {
            class434 var2 = class483.method2888(arg1, 86, 3);
            var2.method2628(70);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lkf;B)V")
    public abstract void method2211(class165 arg0, byte arg1);

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
    public abstract void method2212(boolean arg0);
}
