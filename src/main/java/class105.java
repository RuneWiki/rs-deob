import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class105 {

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "Loo;")
    private class652 field1218 = new class652(128);

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "Lwia;")
    private class791 field1220;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "Lbaa;")
    public static class547 field1216 = new class547();

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field1213;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field1215;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "I")
    public static int field1222;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static final void method736(int arg0) {
        field1219++;
        if (class616.field8626) {
            return;
        }
        if (arg0 != -501) {
            field1214 = -79;
        }
        class616.field8626 = true;
        class174.field2697 += (12.0F - class174.field2697) / 2.0F;
        class532.field7692 = true;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
    public static void method737(byte arg0) {
        field1216 = null;
        if (arg0 != 120) {
            field1214 = 44;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(JIZLjava/lang/String;ZIZIJIBLjava/lang/String;I)V")
    public static final void method738(long arg0, int arg1, boolean arg2, String arg3, boolean arg4, int arg5, boolean arg6, int arg7, long arg8, int arg9, byte arg10, String arg11, int arg12) {
        if (arg10 != -42) {
            field1214 = 29;
        }
        field1222++;
        if (!class626.field8777 && class618.field8644 < 500) {
            int var15 = arg5 == -1 ? class275.field3980 : arg5;
            class746 var16 = new class746(arg11, arg3, var15, arg12, arg1, arg0, arg7, arg9, arg2, arg4, arg8, arg6);
            class429.method2580(110, var16);
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
    public static final void method739(byte arg0) {
        field1213++;
        class582.field8220.method3735(2);
        if (arg0 >= -89) {
            method739((byte) 8);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method740(String arg0, int arg1) {
        field1215++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= arg1) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IB)Lcm;")
    public final class759 method741(int arg0, byte arg1) {
        field1217++;
        class652 var3 = this.field1218;
        class759 var4;
        synchronized (this.field1218) {
            var4 = (class759) this.field1218.method3742((byte) 67, (long) arg0);
        }
        if (arg1 >= -124) {
            return null;
        } else if (var4 == null) {
            byte[] var5 = this.field1220.method4339(class304.method1971(0, arg0), 0, class202.method1410(arg0, true));
            class759 var6 = new class759();
            if (var5 != null) {
                var6.method4217(new class494(var5), false);
            }
            class652 var7 = this.field1218;
            synchronized (this.field1218) {
                this.field1218.method3739((long) arg0, (byte) 67, var6);
                return var6;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Ldt;ILwia;)V")
    public class105(class252 arg0, int arg1, class791 arg2) {
        this.field1220 = arg2;
        if (this.field1220 != null) {
            int var4 = this.field1220.method4332((byte) -117) - 1;
            this.field1220.method4353(var4, true);
        }
    }
}
