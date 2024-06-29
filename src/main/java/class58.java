import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class58 extends class8 {

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "Ljava/lang/String;")
    public static String field820 = "Drop";

    @OriginalMember(owner = "client!bf", name = "Q", descriptor = "[I")
    public static int[] field824 = new int[200];

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!bf", name = "P", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public int field825;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V", line = 10)
    public static final void method369() {
        for (int var0 = 0; var0 < class274.field4415; var0++) {
            class153 var1 = class94.field1291[var0];
            class20.method106(var1);
            class94.field1291[var0] = null;
        }
        class274.field4415 = 0;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLjava/lang/String;)I", line = 29)
    public static final int method370(byte arg0, String arg1) {
        field815++;
        int var2 = -80 / ((61 - arg0) / 62);
        if (class20.field289 == null || arg1.length() == 0) {
            return -1;
        }
        for (int var3 = 0; var3 < class20.field289.field3270; var3++) {
            if (class115.method791(-78, " ", "<br>", class20.field289.field3262[var3]).equals(arg1)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIIII)V", line = 53)
    public final void method371(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field814++;
        if (arg0 < 44) {
            this.field825 = 110;
        }
        int var6 = this.field813 << 3;
        int var7 = (arg3 << 4) + (var6 & 0xF);
        int var8 = this.field817 << 3;
        int var9 = (arg2 << 4) + (var8 & 0xF);
        this.method377(var6, var8, var7, var9, arg4, arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIB)I", line = 70)
    public static final int method372(int arg0, int arg1, byte arg2) {
        field818++;
        int var3 = arg0 >> 31 & arg1 - 1;
        return arg2 == -56 ? ((arg0 >>> 31) + arg0) % arg1 + var3 : -111;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lvk;ZB)V", line = 90)
    public static final void method374(class90 arg0, boolean arg1, byte arg2) {
        field819++;
        int var3 = (int) arg0.field2744;
        if (arg2 != 103) {
            method369();
        }
        int var4 = arg0.field1249;
        arg0.method1212((byte) 77);
        if (arg1) {
            class86.method583(var4, -109);
        }
        class288.method2068(var4, (byte) 65);
        class157 var5 = class142.method1053(var3, 65535);
        if (var5 != null) {
            class320.method2252(var5, 0);
        }
        int var6 = class185.field3070;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class100.method690((byte) 88, class113.field1727[var7])) {
                class219.method1557(-1, var7);
            }
        }
        if (class185.field3070 == 1) {
            class196.field3204 = false;
            class93.method620(true, class227.field3617, class121.field1831, class295.field4671, class315.field4877);
        } else {
            class93.method620(true, class227.field3617, class121.field1831, class295.field4671, class315.field4877);
            int var8 = class282.field4538.method1804(class116.field1762);
            for (int var9 = 0; var9 < class185.field3070; var9++) {
                int var10 = class282.field4538.method1804(class129.method935(var9, 2017));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class295.field4671 = class185.field3070 * 15 + (class52.field737 ? 26 : 22);
            class227.field3617 = var8 + 8;
        }
        if (class147.field2287 != -1) {
            class60.method410(-11484, 1, class147.field2287);
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V", line = 176)
    public static void method378(int arg0) {
        field824 = null;
        field820 = null;
        if (arg0 <= 11) {
            method378(-36);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
    public abstract void method368(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)V")
    public abstract void method373(int arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)V")
    public abstract void method375(int arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V")
    public abstract void method376(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII)V")
    public abstract void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)V")
    public abstract void method379(int arg0, int arg1);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIII)V")
    public abstract void method380(int arg0, int arg1, int arg2, int arg3, int arg4);
}
