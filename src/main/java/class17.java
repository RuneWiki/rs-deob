import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public abstract class class17 extends class172 {

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "Ljl;")
    public static class332 field196 = new class332(64);

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public int field197;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public int field198;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!ml", name = "P", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!ml", name = "Q", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ml", name = "R", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!ml", name = "S", descriptor = "[S")
    public static short[] field204;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V", line = 8)
    public static void method91(boolean arg0) {
        if (arg0) {
            method97(41);
        }
        field196 = null;
        field204 = null;
    }

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V", line = 46)
    public static final void method97(int arg0) {
        field195++;
        try {
            if (class152.field2417 == 1) {
                int var1 = class36.field535.method1655((byte) -122);
                if (var1 > 0 && class36.field535.method1677((byte) 46)) {
                    int var2 = var1 - class267.field4479;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class36.field535.method1690(var2, (byte) 78);
                    return;
                }
                class36.field535.method1686(-117);
                class36.field535.method1659((byte) 94);
                class27.field329 = null;
                if (class135.field2259 == null) {
                    class152.field2417 = 0;
                } else {
                    class152.field2417 = 2;
                }
                class213.field3420 = null;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class36.field535.method1686(-121);
            class27.field329 = null;
            class135.field2259 = null;
            class152.field2417 = 0;
            class213.field3420 = null;
        }
        if (arg0 != 402714629) {
            method91(true);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIBII)V", line = 92)
    public final void method98(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field194++;
        if (arg2 > -70) {
            return;
        }
        int var6 = this.field198 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field201 << 3;
        int var9 = (arg0 << 4) + (var8 & 0xF);
        this.method96(var6, var8, var7, var9, arg1, arg4);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
    public abstract void method89(int arg0, int arg1);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
    public abstract void method90(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(III)V")
    public abstract void method92(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
    public abstract void method93(int arg0, int arg1);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V")
    public abstract void method94(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(II)V")
    public abstract void method95(int arg0, int arg1);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIII)V")
    public abstract void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
