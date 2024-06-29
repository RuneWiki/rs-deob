import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class425 extends class406 {

    @OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
    public static int field6085 = -1;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Llg;")
    public static class237 field6071 = new class237(50);

    @OriginalMember(owner = "client!ge", name = "R", descriptor = "J")
    public static long field6092 = 0L;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public int field6066;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "I")
    public int field6068;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "I")
    public int field6072;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public int field6073;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "I")
    public int field6075;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public int field6076;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public int field6077;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "I")
    public int field6078;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "I")
    public int field6079;

    @OriginalMember(owner = "client!ge", name = "E", descriptor = "I")
    public int field6080;

    @OriginalMember(owner = "client!ge", name = "F", descriptor = "I")
    public int field6081;

    @OriginalMember(owner = "client!ge", name = "G", descriptor = "I")
    public int field6082;

    @OriginalMember(owner = "client!ge", name = "I", descriptor = "I")
    public int field6083;

    @OriginalMember(owner = "client!ge", name = "J", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!ge", name = "L", descriptor = "I")
    public int field6086;

    @OriginalMember(owner = "client!ge", name = "M", descriptor = "I")
    public int field6087;

    @OriginalMember(owner = "client!ge", name = "N", descriptor = "I")
    public int field6088;

    @OriginalMember(owner = "client!ge", name = "O", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!ge", name = "Q", descriptor = "I")
    public static int field6091;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lds;")
    public class10 field6069;

    @OriginalMember(owner = "client!ge", name = "P", descriptor = "Lwd;")
    public class148 field6090;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Len;")
    public class173 field6074;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "Lvo;")
    public class27 field6065;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method2674(int arg0) {
        if (arg0 != 7721) {
            this.field6078 = -76;
        }
        this.field6065 = null;
        field6067++;
        this.field6090 = null;
        this.field6069 = null;
        this.field6074 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([ILqm;B[I[I)V")
    public static final void method2675(int[] arg0, class77 arg1, byte arg2, int[] arg3, int[] arg4) {
        field6070++;
        if (arg2 != -34) {
            field6085 = -67;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg0[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var7 != 0 && arg1.field5596.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field5596[var9] = null;
                    } else {
                        class412 var10 = class189.method1288(-8192, var6);
                        int var11 = var10.field5910;
                        class299 var12 = arg1.field5596[var9];
                        if (var12 != null) {
                            if (var12.field4182 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field5596[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field4185 = 1;
                                    var12.field4183 = 0;
                                    var12.field4187 = 0;
                                    var12.field4186 = 0;
                                    var12.field4188 = var8;
                                    class148.method896(false, var10, (byte) 101, arg1.field3284, 0, arg1.field3269);
                                } else if (var11 == 2) {
                                    var12.field4187 = 0;
                                }
                            } else if (var10.field5931 >= class189.method1288(arg2 - 8158, var12.field4182).field5931) {
                                var12 = arg1.field5596[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class299 var13 = arg1.field5596[var9] = new class299();
                            var13.field4185 = 1;
                            var13.field4187 = 0;
                            var13.field4182 = var6;
                            var13.field4183 = 0;
                            var13.field4188 = var8;
                            var13.field4186 = 0;
                            class148.method896(false, var10, (byte) 104, arg1.field3284, 0, arg1.field3269);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
    public static void method2676(int arg0) {
        field6071 = null;
        if (arg0 >= -122) {
            method2676(75);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method2677(boolean arg0, long arg1) {
        field6089++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            if (!arg0) {
                return null;
            }
            while (var4 != 0L) {
                var3++;
                var4 /= 37L;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class168.field2343[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}
