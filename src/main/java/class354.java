import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class class354 {

    @OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
    private int field4723;

    @OriginalMember(owner = "client!rq", name = "o", descriptor = "I")
    private int field4730;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "Lac;")
    public class541 field4717;

    @OriginalMember(owner = "client!rq", name = "n", descriptor = "Z")
    private boolean field4729;

    @OriginalMember(owner = "client!rq", name = "m", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "Lea;")
    public static class547 field4720 = new class547(111, 1);

    @OriginalMember(owner = "client!rq", name = "q", descriptor = "[I")
    public static int[] field4732 = new int[2];

    @OriginalMember(owner = "client!rq", name = "p", descriptor = "Lea;")
    public static class547 field4731 = new class547(14, 2);

    @OriginalMember(owner = "client!rq", name = "r", descriptor = "I")
    public static int field4733 = 0;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!rq", name = "f", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!rq", name = "j", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!rq", name = "k", descriptor = "I")
    public static int field4726;

    @OriginalMember(owner = "client!rq", name = "l", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!rq", name = "g", descriptor = "[I")
    public static int[] field4722;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "(I)V")
    public abstract void method693(int arg0);

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)V")
    public static final void method2048(byte arg0) {
        class11.field68.method2276((byte) -13, 1, class11.field68.field5502);
        field4721++;
        class11.field68.method2276((byte) -13, 1, class11.field68.field5548);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5493);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5524);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5498);
        class11.field68.method2276((byte) -13, 1, class11.field68.field5499);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5510);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5532);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5494);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5545);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5521);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5541);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5534);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5512);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5505);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5520);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5492);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5508);
        class11.field68.method2276((byte) -13, 0, class11.field68.field5536);
        if (arg0 < 17) {
            method2048((byte) -54);
        }
        class102.method703((byte) 62);
        class11.field68.method2276((byte) -13, 2, class11.field68.field5501);
        class11.field68.method2276((byte) -13, 2, class11.field68.field5511);
        class216.method1201((byte) 111);
        class723.method4058((byte) 122);
        class139.field1786 = true;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2049(int arg0, int arg1, byte arg2) {
        field4726++;
        int var3 = -41 / ((71 - arg2) / 40);
        return (arg0 & 0x70000) != 0 | class55.method317(arg0, arg1, (byte) 85) || class584.method3261(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BZI)V")
    public static final void method2050(String arg0, String arg1, byte arg2, boolean arg3, int arg4) {
        class201.method1110(arg3, arg4, arg0, 2, arg1, true, -1);
        field4724++;
        if (arg2 <= 0) {
            field4731 = null;
        }
    }

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "(I)V")
    public static void method2051(int arg0) {
        field4732 = null;
        field4722 = null;
        field4731 = null;
        field4720 = null;
        if (arg0 != 32414) {
            method2048((byte) -61);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[B)V")
    public final void method2052(int arg0, int arg1, byte[] arg2) {
        field4727++;
        this.method693(arg0 + arg0);
        if (arg1 > this.field4730) {
            OpenGL.glBufferDataARBub(this.field4723, arg1, arg2, 0, this.field4729 ? 35040 : 35044);
            this.field4717.field7547 += arg1 - this.field4730;
            this.field4730 = arg1;
        } else {
            OpenGL.glBufferSubDataARBub(this.field4723, 0, arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field4717.method3022(this.field4730, (byte) 121, this.field4728);
        field4716++;
        super.finalize();
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lac;I[BIZ)V")
    public class354(class541 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field4723 = arg1;
        this.field4730 = arg3;
        this.field4717 = arg0;
        this.field4729 = arg4;
        OpenGL.glGenBuffersARB(1, class115.field1518, 0);
        this.field4728 = class115.field1518[0];
        this.method693(0);
        OpenGL.glBufferDataARBub(arg1, this.field4730, arg2, 0, this.field4729 ? 35040 : 35044);
        this.field4717.field7547 += this.field4730;
    }

    @OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lac;ILjaclib/memory/Buffer;IZ)V")
    public class354(class541 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field4717 = arg0;
        this.field4723 = arg1;
        this.field4729 = arg4;
        this.field4730 = arg3;
        OpenGL.glGenBuffersARB(1, class115.field1518, 0);
        this.field4728 = class115.field1518[0];
        this.method693(0);
        OpenGL.glBufferDataARBa(arg1, this.field4730, arg2.getAddress(), this.field4729 ? 35040 : 35044);
        this.field4717.field7547 += this.field4730;
    }
}
