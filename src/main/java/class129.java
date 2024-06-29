import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class129 extends class189 {

    @OriginalMember(owner = "client!m", name = "x", descriptor = "Lkh;")
    public class13 field2193;

    @OriginalMember(owner = "client!m", name = "F", descriptor = "Lti;")
    public class307 field2201;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "Ls;")
    public static class186 field2195 = new class186(74, 2);

    @OriginalMember(owner = "client!m", name = "D", descriptor = "[I")
    public static int[] field2199 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public int field2196;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public int field2203;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "Lo;")
    public static class24 field2198;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "[I")
    public static int[] field2192;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/lang/String;IIIIIII)V")
    public static final void method1008(String arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 10) {
            field2195 = null;
        }
        field2197++;
        class69 var8 = new class69();
        var8.field1390 = arg5;
        var8.field1397 = arg7;
        var8.field1392 = arg1;
        var8.field1394 = arg0;
        var8.field1398 = arg3;
        var8.field1399 = arg6;
        var8.field1391 = class62.field1268 + arg2;
        class4.field81.method531((byte) -127, var8);
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
    public final void method1009(byte arg0) {
        this.field2196 = this.field2193.field243;
        this.field2203 = this.field2193.field241;
        field2200++;
        this.field2191 = this.field2193.field240;
        if (this.field2193.field235 != null) {
            this.field2193.field235.method829(this.field2201.field4670, this.field2201.field4653, this.field2201.field4659, class335.field5058);
        }
        if (arg0 < 40) {
            this.method1009((byte) 119);
        }
        this.field2194 = class335.field5058[0];
        this.field2202 = class335.field5058[2];
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILlt;IZII)Ljava/awt/Frame;")
    public static final Frame method1010(int arg0, class480 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2205++;
        if (!arg1.method2874(10000)) {
            return null;
        }
        if (arg5 == 0) {
            class39[] var6 = class467.method2796(arg1, 555814242);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field563 == arg4 && var6[var8].field562 == arg0 && (arg2 == 0 || var6[var8].field565 == arg2) && (!var7 || var6[var8].field560 > arg5)) {
                    var7 = true;
                    arg5 = var6[var8].field560;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (!arg3) {
            method1011(-125);
        }
        class121 var9 = arg1.method2875(117, arg0, arg2, arg5, arg4);
        while (var9.field2119 == 0) {
            class50.method470(10L, -5);
        }
        Frame var10 = (Frame) var9.field2115;
        if (var10 == null) {
            return null;
        } else if (var9.field2119 == 2) {
            class308.method1969(arg1, var10, 1603251406);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2199 = null;
        field2192 = null;
        field2195 = null;
        if (arg0 == 10) {
            field2198 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lkh;Loi;)V")
    public class129(class13 arg0, class53 arg1) {
        this.field2193 = arg0;
        this.field2201 = this.field2193.method88((byte) 110);
        this.method1009((byte) 82);
    }
}
