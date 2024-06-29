import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class266 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Z")
    public boolean field3926 = true;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "Z")
    public boolean field3927 = true;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Z")
    public boolean field3922 = false;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "Z")
    public boolean field3928 = true;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Z")
    public boolean field3939 = true;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "Z")
    public boolean field3929 = true;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public int field3935 = 2;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Z")
    public boolean field3936 = true;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Z")
    public boolean field3933 = true;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Z")
    public boolean field3931 = false;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public int field3934 = 127;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public int field3944 = 0;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public int field3948 = 0;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "Z")
    public boolean field3937 = true;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public int field3932 = 3;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "I")
    public int field3943 = 1;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "Z")
    public boolean field3945 = true;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public int field3930 = 0;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public int field3952 = 2;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
    public boolean field3925 = true;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Z")
    public boolean field3938 = true;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "Z")
    public boolean field3924 = true;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public int field3946 = 255;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public int field3923 = 0;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "I")
    public int field3947 = 2;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "I")
    public int field3949 = 127;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public int field3941 = 0;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "I")
    public int field3951 = 0;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public int field3953 = 2;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "Z")
    public boolean field3950 = true;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3940 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "[Lun;")
    public static class110[] field3956 = new class110[14];

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public static int field3954 = 0;

    @OriginalMember(owner = "client!uf", name = "H", descriptor = "F")
    public static float field3955 = 0.0F;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "Z")
    public boolean field3942;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "Z")
    public boolean field3957;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
    public static final void method1742(int arg0, int arg1) {
        field3958++;
        class186 var2 = class275.method1789(arg1, (byte) 123, arg0);
        var2.method1279((byte) -65);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method1743(int arg0) {
        field3956 = null;
        if (arg0 > 12) {
            field3940 = null;
        }
    }
}
