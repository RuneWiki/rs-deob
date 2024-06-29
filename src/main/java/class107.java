import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class class107 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field2286 = 0;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lcd;")
    public static class23 field2291 = class54.method414(")4l", -1);

    @OriginalMember(owner = "client!m", name = "k", descriptor = "Lcd;")
    public static class23 field2296 = class54.method414("Die Adresse dieses Computers wurde gesperrt)1", -1);

    @OriginalMember(owner = "client!m", name = "g", descriptor = "I")
    public static int field2292 = 0;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "Lcd;")
    public static class23 field2295 = class54.method414("titlebutton", -1);

    @OriginalMember(owner = "client!m", name = "l", descriptor = "Lcd;")
    public static class23 field2297 = class54.method414("Lade Titelbild )2 ", -1);

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "Lkh;")
    public static class97 field2289;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "[I")
    public static int[] field2287;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[Loe;")
    public static class130[] field2290;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "[Lea;")
    public static class38[] field2288;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBILea;II)V")
    public static final void method697(int arg0, byte arg1, int arg2, class38 arg3, int arg4, int arg5) {
        field2294++;
        if (arg3 == null) {
            return;
        }
        if (arg1 != -25) {
            field2286 = -21;
        }
        int var6 = arg0 * arg0 + arg2 * arg2;
        int var7 = class67.field1580 + class48.field1155 & 0x7FF;
        if (var6 > 6400) {
            return;
        }
        int var8 = class140.field2878[var7];
        int var9 = class140.field2891[var7];
        int var10 = var8 * 256 / (field2292 + 256);
        int var11 = var9 * 256 / (field2292 + 256);
        int var12 = arg0 * var11 + arg2 * var10 >> 16;
        int var13 = arg2 * var11 - arg0 * var10 >> 16;
        if (var6 > 2500) {
            arg3.method318(class168.field3357, var12 + arg4 + 4 + 94 - arg3.field786 / 2, -(arg3.field784 / 2) + -var13 + -4 + arg5 + 83);
        } else {
            arg3.method315(arg4 + var12 + 94 + 4 - arg3.field786 / 2, -var13 + arg5 + -(arg3.field784 / 2) + -4 + 83);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method698(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method699(int arg0) {
        if (arg0 != -6401) {
            method701(-62, null, 47, null);
        }
        field2297 = null;
        field2289 = null;
        field2295 = null;
        field2291 = null;
        field2296 = null;
        field2290 = null;
        field2287 = null;
        field2288 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)I")
    public abstract int method700(byte arg0);

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILcd;ILcd;)V")
    public static final void method701(int arg0, class23 arg1, int arg2, class23 arg3) {
        class183.method1128(arg2, null, (byte) 85, arg3, arg1);
        if (arg0 != 10945) {
            method699(-26);
        }
        field2293++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method702(int arg0, Component arg1);
}
