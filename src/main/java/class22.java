import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class22 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Ljd;")
    private static class86 field556 = class122.method868("wave2:", true);

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Ljd;")
    public static class86 field565 = field556;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Ljd;")
    public static class86 field567 = class122.method868("hitbar_default", true);

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Ljd;")
    public static class86 field560 = field556;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lbj;")
    public static class151 field566;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field563;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)Ltf;")
    public static final class105 method162(boolean arg0, int arg1) {
        class105 var2 = (class105) class230.field4178.method395((long) arg1, (byte) 123);
        if (!arg0) {
            method162(false, 108);
        }
        field562++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field2886.method1084((byte) -124, 11, arg1);
        class105 var4 = new class105();
        if (var3 != null) {
            var4.method751(!arg0, new class200(var3));
        }
        class230.field4178.method398((long) arg1, (byte) 116, var4);
        return var4;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Leh;III)V")
    public static final void method163(class80 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class70.field1424) {
            class249 var4 = class248.field4406[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4437 != null && var4.field4437.field2051.method563()) {
                arg0.method562(var4.field4437.field2051, 128, 0, 0, true);
            }
        }
        if (arg3 < class70.field1424) {
            class249 var5 = class248.field4406[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4437 != null && var5.field4437.field2051.method563()) {
                arg0.method562(var5.field4437.field2051, 0, 0, 128, true);
            }
        }
        if (arg2 < class70.field1424 && arg3 < class126.field2436) {
            class249 var6 = class248.field4406[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4437 != null && var6.field4437.field2051.method563()) {
                arg0.method562(var6.field4437.field2051, 128, 0, 128, true);
            }
        }
        if (arg2 < class70.field1424 && arg3 > 0) {
            class249 var7 = class248.field4406[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4437 != null && var7.field4437.field2051.method563()) {
                arg0.method562(var7.field4437.field2051, 128, 0, -128, true);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class22() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLce;Lce;)V")
    public static final void method164(boolean arg0, class207 arg1, class207 arg2) {
        if (arg0) {
            method163((class80) null, -39, -60, 66);
        }
        if (arg2.field3762 != null) {
            arg2.method1477(1);
        }
        field564++;
        arg2.field3762 = arg1.field3762;
        arg2.field3765 = arg1;
        arg2.field3762.field3765 = arg2;
        arg2.field3765.field3762 = arg2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method165(int arg0) {
        field554++;
        class214.field3869.method702((byte) -88);
        if (arg0 != 1) {
            method164(true, (class207) null, (class207) null);
        }
        class73.field1475.method702((byte) -88);
        class92.field1871.method702((byte) -88);
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
    public static void method166(int arg0) {
        field565 = null;
        field567 = null;
        field566 = null;
        field556 = null;
        if (arg0 >= -20) {
            method163((class80) null, -36, -43, -49);
        }
        field560 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLbj;)V")
    public static final void method167(boolean arg0, class151 arg1) {
        field558++;
        class219.field3942 = class219.method1546(13139, arg1, field557);
        class168.field3108 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            int var4 = class27.field616[var2 + 1] >> 16 & 0xFF;
            float var5 = (float) ((class27.field616[var2] & 0xFF0000) >> 16);
            float var6 = ((float) var4 - var5) / 64.0F;
            float var7 = (float) (class27.field616[var2] & 0xFF);
            int var8 = class27.field616[var2 + 1] >> 8 & 0xFF;
            int var9 = class27.field616[var2 + 1] & 0xFF;
            float var10 = (float) ((class27.field616[var2] & 0xFF00) >> 8);
            float var11 = ((float) var9 - var7) / 64.0F;
            float var12 = ((float) var8 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class168.field3108[var2 * 64 + var13] = class49.method377(class49.method377((int) var10 << 8, (int) var5 << 16), (int) var7);
                var5 += var6;
                var10 += var12;
                var7 += var11;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class168.field3108[var3] = class27.field616[3];
        }
        class78.field1539 = new int[32768];
        class43.field954 = new int[32768];
        if (!arg0) {
            method164(true, (class207) null, (class207) null);
        }
        class168.method1208(20792, (class101) null);
        class194.field3483 = new int[32768];
        class273.field4796 = new int[32768];
        class83.field1619 = new class167(128, 254);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILqk;[B)V")
    public final void method168(int arg0, class200 arg1, byte[] arg2) {
        field555++;
        if (arg1.field3547[arg1.field3565] != 31 || arg1.field3547[arg1.field3565 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field563 == null) {
            this.field563 = new Inflater(true);
        }
        try {
            this.field563.setInput(arg1.field3547, arg1.field3565 + arg0, arg1.field3547.length - 8 - (arg1.field3565 + 10));
            this.field563.inflate(arg2);
        } catch (Exception var4) {
            this.field563.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field563.reset();
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(III)V")
    private class22(int arg0, int arg1, int arg2) {
    }
}
