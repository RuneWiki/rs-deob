import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 extends class4 {

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "Lri;")
    public class66 field354;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Lub;")
    public static class89 field357;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBII)V")
    public static final void method197(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class259 var5 = class213.method1464((byte) -126, arg1, 4);
        field358++;
        var5.method1766(arg2 ^ 0x60);
        var5.field4113 = arg4;
        var5.field4128 = arg3;
        var5.field4114 = arg0;
        if (arg2 != 96) {
            method199((byte) -109);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIBLf;)V")
    public static final void method198(int arg0, int arg1, byte arg2, class36 arg3) {
        field356++;
        if (class205.field3291 < 2 && class51.field894 == 0 && !class288.field4560) {
            return;
        }
        String var4 = class227.method1600(81);
        if (arg2 >= -103) {
            field357 = null;
        }
        if (arg3 == null) {
            int var5 = class262.field4165.method1803(var4, arg0 + 4, arg1 + 15, 16777215, 0, class198.field3162, class89.field1441);
            class154.method1072(arg1, 15, class262.field4165.method1822(var4) + var5, arg0 + 4, (byte) -109);
            return;
        }
        class269 var6 = arg3.method297(class247.field3947, true);
        if (var6 == null) {
            var6 = class262.field4165;
        }
        var6.method1809(var4, arg0, arg1, arg3.field642, arg3.field676, arg3.field710, arg3.field666, arg3.field603, arg3.field625, class198.field3162, class89.field1441, class155.field2500);
        class154.method1072(class155.field2500[1], class155.field2500[3], class155.field2500[2], class155.field2500[0], (byte) -106);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    public static void method199(byte arg0) {
        int var1 = -125 % ((arg0 - 20) / 47);
        field357 = null;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lri;)V")
    public class21(class66 arg0) {
        this.field354 = arg0;
    }
}
