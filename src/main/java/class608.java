import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class608 extends OutputStream {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lwh;")
    public static class546 field8455 = new class546(512);

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field8457;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8459;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8460;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[S")
    public static short[] field8456;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V", line = 3)
    public static void method3374(int arg0) {
        field8455 = null;
        field8456 = null;
        if (arg0 != 27120) {
            method3376(67, -71, 114, -101, -21, -75, -102);
        }
    }

    @OriginalMember(owner = "client!pl", name = "write", descriptor = "(I)V", line = 22)
    public final void write(int arg0) throws IOException {
        field8460++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;ILgba;I)Lba;", line = 31)
    public static final class661 method3375(String arg0, int arg1, class388 arg2, int arg3) {
        if (arg3 != 24573) {
            method3376(100, 0, 18, -108, -84, 60, -25);
        }
        field8459++;
        if (arg1 == 0) {
            return arg2.method2225(arg0, (byte) 76);
        } else if (arg1 == 1) {
            try {
                class507.method2882("openjs", 7013, new Object[] { (new URL(class516.field7178.getCodeBase(), arg0)).toString() }, class516.field7178);
                class661 var4 = new class661();
                var4.field9420 = 1;
                return var4;
            } catch (Throwable var10) {
                class661 var5 = new class661();
                var5.field9420 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                class516.field7178.getAppletContext().showDocument(new URL(class516.field7178.getCodeBase(), arg0), "_blank");
                class661 var6 = new class661();
                var6.field9420 = 1;
                return var6;
            } catch (Exception var11) {
                class661 var7 = new class661();
                var7.field9420 = 2;
                return var7;
            }
        } else if (arg1 == 3) {
            try {
                class507.method2883(class516.field7178, -4200, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                class516.field7178.getAppletContext().showDocument(new URL(class516.field7178.getCodeBase(), arg0), "_top");
                class661 var8 = new class661();
                var8.field9420 = 1;
                return var8;
            } catch (Exception var12) {
                class661 var9 = new class661();
                var9.field9420 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)V", line = 112)
    public static final void method3376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != 8 && arg3 != 16) {
            class207 var7 = class153.field2168[arg0][arg5][arg2];
            if (var7 == null) {
                var7 = new class207(arg0);
            }
            if (arg3 == 1) {
                var7.field2772 = (short) arg4;
                var7.field2773 = (short) arg6;
            } else if (arg3 == 2) {
                var7.field2770 = (short) arg4;
                var7.field2775 = (short) arg6;
            }
            if (class82.field945) {
                class627.method3476((byte) -43);
            }
        } else if (arg3 == 8) {
            int var8 = arg5 << class62.field762;
            int var9 = var8 + class458.field6012;
            int var10 = arg2 << class62.field762;
            int var11 = class458.field6012 + var10;
            int var12 = class454.field5981[arg0].method1611(arg5, true, arg2);
            int var13 = class454.field5981[arg0].method1611(arg5 + 1, true, arg2 + 1);
            class64.field805[class113.field1433++] = new class152(arg3, arg0, var8, var9, var9, var8, var12, var13, var13 - arg4, -arg4 + var12, var10, var11, var11, var10);
        } else {
            int var14 = (arg5 << class62.field762) + class458.field6012;
            int var15 = var14 - class458.field6012;
            int var16 = arg2 << class62.field762;
            int var17 = class458.field6012 + var16;
            int var18 = class454.field5981[arg0].method1611(arg5 + 1, true, arg2);
            int var19 = class454.field5981[arg0].method1611(arg5, true, arg2 + 1);
            class64.field805[class113.field1433++] = new class152(arg3, arg0, var14, var15, var15, var14, var18, var19, var19 - arg4, var18 - arg4, var16, var17, var17, var16);
        }
        field8458++;
        if (arg1 != -2) {
            method3374(-109);
        }
    }
}
