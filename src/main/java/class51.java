import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class51 {

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Z")
    public boolean field815 = false;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public int field810;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "J")
    public long field813;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lkb;")
    public class280 field809;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B)[B", line = 10)
    public static final byte[] method389(int arg0, byte[] arg1) {
        class221 var2 = new class221(arg1);
        field818++;
        int var3 = var2.method1509(true);
        int var4 = var2.method1517((byte) -121);
        if (var4 < 0 || !(class35.field535 == 0 || var4 <= class35.field535)) {
            throw new RuntimeException();
        } else if (arg0 == var3) {
            byte[] var5 = new byte[var4];
            var2.method1537(var4, 0, var5, 2);
            return var5;
        } else {
            int var6 = var2.method1517((byte) -115);
            if (var6 < 0 || class35.field535 != 0 && var6 > class35.field535) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class277.method1878(var7, var6, arg1, var4, 9);
            } else {
                class253.field4296.method1129(var2, (byte) -107, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([Leb;II)V", line = 75)
    public static final void method390(class253[] arg0, int arg1, int arg2) {
        for (int var3 = arg1; var3 < arg0.length; var3++) {
            class253 var4 = arg0[var3];
            if (var4 != null && var4.field4196 == arg2 && (!var4.field4265 || !client.method766(var4))) {
                if (var4.field4216 == 0) {
                    if (!var4.field4265 && client.method766(var4) && class29.field480 != var4) {
                        continue;
                    }
                    method390(arg0, arg1, var4.field4206);
                    if (var4.field4275 != null) {
                        method390(var4.field4275, 0, var4.field4206);
                    }
                    class174 var5 = (class174) class81.field1253.method1372(false, (long) var4.field4206);
                    if (var5 != null) {
                        class288.method1939(var5.field2660, 26587);
                    }
                }
                if (var4.field4216 == 6) {
                    if (var4.field4300 != -1 || var4.field4294 != -1) {
                        boolean var6 = class105.method664(-4, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field4294;
                        } else {
                            var7 = var4.field4300;
                        }
                        if (var7 != -1) {
                            class33 var8 = class171.method1136(var7, -6722);
                            if (var8 != null) {
                                var4.field4191 += class282.field4788;
                                while (var4.field4191 > var8.field502[var4.field4336]) {
                                    var4.field4191 -= var8.field502[var4.field4336];
                                    var4.field4336++;
                                    if (var8.field529.length <= var4.field4336) {
                                        var4.field4336 -= var8.field513;
                                        if (var4.field4336 < 0 || var4.field4336 >= var8.field529.length) {
                                            var4.field4336 = 0;
                                        }
                                    }
                                    class29.method205(var4, (byte) 90);
                                }
                            }
                        }
                    }
                    if (var4.field4189 != 0 && !var4.field4265) {
                        int var9 = var4.field4189 << 16 >> 16;
                        int var10 = var4.field4189 >> 16;
                        int var11 = class282.field4788 * var9;
                        int var12 = class282.field4788 * var10;
                        var4.field4319 = var4.field4319 + var11 & 0x7FF;
                        var4.field4302 = var4.field4302 + var12 & 0x7FF;
                        class29.method205(var4, (byte) 117);
                    }
                }
            }
        }
        field814++;
    }
}
