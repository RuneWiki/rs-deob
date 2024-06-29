import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class678 {

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field9427 = -1;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "Z")
    public static boolean field9431 = false;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "Lbu;")
    public static class21 field9430 = new class21(132, 3);

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "Z")
    public static boolean field9432 = false;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field9426;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field9428;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field9434;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "Lgea;")
    public static class80 field9433;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V")
    public static final void method3844(int arg0) {
        for (class753 var1 = (class753) class371.field5135.method636(arg0 + 256); var1 != null; var1 = (class753) class371.field5135.method637(false)) {
            if (var1.field10409 > 1) {
                var1.field10409 = 0;
                class550.field7901.method3739(((class746) var1.field10411.field923.field1600).field10344, (byte) 34, var1);
                var1.field10411.method629(false);
            }
        }
        field9428++;
        class618.field8644 = arg0;
        class310.field4426 = 0;
        class239.field3583.method1729((byte) 46);
        class561.field7973.method2240(-122);
        class371.field5135.method629(false);
        class626.field8777 = false;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIII)V")
    public static final void method3845(int arg0, int arg1, int arg2, int arg3) {
        field9426++;
        String var4 = "tele " + arg3 + "," + (arg1 >> 6) + "," + (arg2 >> 6) + "," + (arg1 & 0x3F) + "," + (arg2 & 0x3F);
        System.out.println(var4);
        class90.method675(var4, 6, false, true);
        if (arg0 != 0) {
            field9427 = -112;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIIIIII)Lqaa;")
    public static final class29 method3846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9434++;
        long var7 = (long) arg3 * 76724863L ^ (long) arg4 * 32147369L ^ (long) arg5 * 986053L ^ (long) arg0 * 475427L ^ (long) arg2 * 97549L ^ (long) arg1 * 67481L;
        class29 var9 = (class29) class239.field3580.method3742((byte) 67, var7);
        if (var9 != null) {
            return var9;
        }
        class29 var10 = class274.field3951.method521(arg1, arg2, arg0, arg5, arg4, arg3);
        class239.field3580.method3739(var7, (byte) 58, var10);
        if (arg6 != 1) {
            method3844(99);
        }
        return var10;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V")
    public static void method3847(byte arg0) {
        if (arg0 > 112) {
            field9430 = null;
            field9433 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;Z)V")
    public static final void method3848(String arg0, Throwable arg1, boolean arg2) {
        field9429++;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class784.method4294(-20109, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class478.method2854(var3, (byte) 96);
            if (arg2) {
                field9427 = 65;
            }
            String var4 = class744.method4146("%3a", ":", (byte) 100, var3);
            String var5 = class744.method4146("%40", "@", (byte) 78, var4);
            String var6 = class744.method4146("%26", "&", (byte) 121, var5);
            String var7 = class744.method4146("%23", "#", (byte) 93, var6);
            if (class688.field9558 != null) {
                class141 var8 = class330.field4656.method2832((byte) -10, new URL(class688.field9558.getCodeBase(), "clienterror.ws?c=" + class35.field472 + "&u=" + (class544.field7814 == null ? String.valueOf(class534.field7712) : class544.field7814) + "&v1=" + class477.field6679 + "&v2=" + class477.field6682 + "&e=" + var7));
                while (var8.field2089 == 0) {
                    class107.method828(1L, (byte) -93);
                }
                if (var8.field2089 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2092;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }
}
