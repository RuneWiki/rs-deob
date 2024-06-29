import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class86 extends class237 {

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field1059 = -1;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field1062 = -2;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "[I")
    public static int[] field1056;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static void method467(byte arg0) {
        field1056 = null;
        if (arg0 > -110) {
            method470(88, 62, -54, (class137) null);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
    public static final void method468(byte arg0, int arg1) {
        int var2 = -14 / ((arg0 + 28) / 38);
        field1063++;
        class47.field590.method1695(arg1, 0);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Leh;I)V")
    public static final void method469(class137 arg0, int arg1) {
        class240.field3954 = arg0;
        field1058++;
        if (arg1 != -7499) {
            field1056 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILeh;)[Lnf;")
    public static final class227[] method470(int arg0, int arg1, int arg2, class137 arg3) {
        field1055++;
        if (class111.method714(arg2, arg0, arg3, 89)) {
            if (arg1 != 7460) {
                method471(-93L, 87);
            }
            return class23.method131(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(JI)V")
    public static final void method471(long arg0, int arg1) {
        field1060++;
        class4.field57.field1228 = 0;
        class4.field57.method580((byte) 116, 21);
        class4.field57.method590(arg0, arg1 ^ 0x3D40FE11);
        class261.field4227 = arg1;
        class220.field3528 = 0;
        field1062 = -3;
        class265.field4265 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
    public static final void method472(int arg0, int arg1) {
        if (arg1 != 2506) {
            return;
        }
        field1057++;
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class70.method392(-63);
        } else if (arg0 == 2) {
            class59.method342((byte) 57);
        } else if (arg0 == 3) {
            class44.method249(10994);
        } else {
            throw new RuntimeException();
        }
    }
}
