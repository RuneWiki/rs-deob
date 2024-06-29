import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class91 extends class237 implements class74 {

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    private int field1231;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "[I")
    public static int[] field1224 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1225;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1227;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Lvh;")
    public static class240 field1226;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 5)
    public static void method620(int arg0) {
        int var1 = 38 % ((-75 - arg0) / 39);
        field1224 = null;
        field1226 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIILos;)V", line = 16)
    public static final void method621(int arg0, int arg1, int arg2, int arg3, class305 arg4) {
        class61 var5 = class176.method1082(arg0, arg1, arg2);
        if (var5 != null) {
            int var6 = 0;
            arg4.field4184 = (arg1 << class34.field484) + class77.field1110;
            arg4.field4178 = arg3;
            arg4.field4185 = (arg2 << class34.field484) + class77.field1110;
            for (class302 var7 = var5.field819; var7 != null; var7 = var7.field4140) {
                if (var7.field4136.field470) {
                    int var8 = var7.field4136.method215(0);
                    if (var8 != -32768 && var8 < var6) {
                        var6 = var8;
                    }
                }
            }
            if (var6 < 0) {
                arg4.field4178 += var6;
                arg4.field4183 = true;
            }
            var5.field837 = arg4;
        }
    }

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "(B)I", line = 53)
    public final int method553(byte arg0) {
        ++field1229;
        return arg0 != -43 ? 71 : 0;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(B)I", line = 65)
    public final int method552(byte arg0) {
        ++field1228;
        return arg0 < 74 ? 116 : this.field1231;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lht;I[BI)V", line = 77)
    public class91(class410 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field1231 = arg1;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lht;ILjaggl/memory/NativeBuffer;)V", line = 85)
    public class91(class410 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field1231 = arg1;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B)J", line = 97)
    public final long method551(byte arg0) {
        if (arg0 >= -15) {
            this.method551((byte) 58);
        }
        ++field1230;
        return super.field3268.method2619();
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(B[BII)V", line = 114)
    public final void method554(byte arg0, byte[] arg1, int arg2, int arg3) {
        int var5 = 5 / ((arg0 - -84) / 42);
        this.method1379(arg1, arg3);
        ++field1223;
        this.field1231 = arg2;
    }
}
