import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class190 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[I")
    public static int[] field3023 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Luf;")
    public static class176 field3029;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3024;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lf;B[B)V")
    public final void method1282(class37 arg0, byte arg1, byte[] arg2) {
        field3022++;
        if (arg0.field583[arg0.field588] != 31 || arg0.field583[arg0.field588 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3024 == null) {
            this.field3024 = new Inflater(true);
        }
        if (arg1 > -54) {
            field3023 = null;
        }
        try {
            this.field3024.setInput(arg0.field583, arg0.field588 + 10, -10 - (arg0.field588 + 8 - arg0.field583.length));
            this.field3024.inflate(arg2);
        } catch (Exception var4) {
            this.field3024.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3024.reset();
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method1283(int arg0) {
        class239.field3692.method1256(8);
        field3028++;
        if (arg0 != 18817) {
            method1286(89, -58, -26, -92, 89, -67, -55, 26);
        }
        int var1 = class239.field3692.method1253((byte) -92, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class239.field3692.method1253((byte) -97, 2);
        if (var2 == 0) {
            class36.field576[class17.field269++] = 2047;
        } else if (var2 == 1) {
            int var3 = class239.field3692.method1253((byte) -128, 3);
            class261.field4058.method1796(var3, (byte) 118, 1);
            int var4 = class239.field3692.method1253((byte) -99, 1);
            if (var4 == 1) {
                class36.field576[class17.field269++] = 2047;
            }
        } else if (var2 == 2) {
            if (class239.field3692.method1253((byte) -92, 1) == 1) {
                int var5 = class239.field3692.method1253((byte) -124, 3);
                class261.field4058.method1796(var5, (byte) 102, 2);
                int var6 = class239.field3692.method1253((byte) -87, 3);
                class261.field4058.method1796(var6, (byte) 105, 2);
            } else {
                int var7 = class239.field3692.method1253((byte) -119, 3);
                class261.field4058.method1796(var7, (byte) 108, 0);
            }
            int var8 = class239.field3692.method1253((byte) -100, 1);
            if (var8 == 1) {
                class36.field576[class17.field269++] = 2047;
            }
        } else if (var2 == 3) {
            int var9 = class239.field3692.method1253((byte) -83, 7);
            class274.field4318 = class239.field3692.method1253((byte) -115, 2);
            int var10 = class239.field3692.method1253((byte) -121, 1);
            int var11 = class239.field3692.method1253((byte) -79, 7);
            int var12 = class239.field3692.method1253((byte) -113, 1);
            if (var12 == 1) {
                class36.field576[class17.field269++] = 2047;
            }
            class261.field4058.method221(var11, var10 == 1, var9, (byte) -108);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V")
    public class190() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BIILng;III)V")
    public static final void method1284(byte arg0, int arg1, int arg2, class77 arg3, int arg4, int arg5, int arg6) {
        field3025++;
        boolean var7 = true;
        boolean var8 = false;
        long var9 = 0L;
        int var11 = 109 % ((arg0 - 48) / 33);
        if (arg4 == 0) {
            var9 = class280.method1875(arg2, arg5, arg1);
        } else if (arg4 == 1) {
            var9 = class158.method1069(arg2, arg5, arg1);
        } else if (arg4 == 2) {
            var9 = class120.method859(arg2, arg5, arg1);
        } else if (arg4 == 3) {
            var9 = class209.method1404(arg2, arg5, arg1);
        }
        int var12 = ((int) var9 & 0x3BDCDB) >> 20;
        int var13 = (int) (var9 >>> 32) & Integer.MAX_VALUE;
        boolean var14 = false;
        int var15 = ((int) var9 & 0x7EE51) >> 14;
        class73 var16 = class85.method690(2276, var13);
        if (var16.method578(false)) {
            class176.method1166(arg5, 21801, arg2, var16, arg1);
        }
        if (var9 == 0L) {
            return;
        }
        if (arg4 == 0) {
            class204.method1367(arg2, arg5, arg1);
            if (var16.field1208 != 0) {
                arg3.method617(var12, !var16.field1158, arg5, var15, arg1, var16.field1197, true);
            }
        } else if (arg4 == 1) {
            class121.method866(arg2, arg5, arg1);
        } else if (arg4 == 2) {
            class180.method1193(arg2, arg5, arg1);
            if (var16.field1208 != 0 && var16.field1232 + arg5 < 104 && (var16.field1232 + arg1) < 104 && var16.field1227 + arg5 < 104 && (var16.field1227 + arg1) < 104) {
                arg3.method610(var16.field1197, var12, arg5, 4096, var16.field1227, var16.field1232, !var16.field1158, arg1);
            }
        } else if (arg4 == 3) {
            class237.method1596(arg2, arg5, arg1);
            if (var16.field1208 == 1) {
                arg3.method611(arg5, 1, arg1);
            }
        }
        if (var16.field1189 != null) {
            class73 var21 = var16.method577(70);
            return;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
    public static void method1285(int arg0) {
        field3029 = null;
        field3023 = null;
        if (arg0 != -14642) {
            field3023 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3027++;
        int var8 = class68.method533(class271.field4289, class113.field1779, arg5, (byte) 57);
        int var9 = class68.method533(class271.field4289, class113.field1779, arg2, (byte) 23);
        if (arg4 > -39) {
            field3023 = null;
        }
        int var10 = class68.method533(class75.field1265, class261.field4025, arg0, (byte) 88);
        int var11 = class68.method533(class75.field1265, class261.field4025, arg1, (byte) 103);
        int var12 = class68.method533(class271.field4289, class113.field1779, arg5 + arg6, (byte) 116);
        int var13 = class68.method533(class271.field4289, class113.field1779, arg2 - arg6, (byte) 110);
        for (int var14 = var8; var14 < var12; var14++) {
            class263.method1788(var10, -18732, arg7, class156.field2379[var14], var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class263.method1788(var10, -18732, arg7, class156.field2379[var15], var11);
        }
        int var16 = class68.method533(class75.field1265, class261.field4025, arg0 + arg6, (byte) 34);
        int var17 = class68.method533(class75.field1265, class261.field4025, arg1 - arg6, (byte) 46);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class156.field2379[var18];
            class263.method1788(var10, -18732, arg7, var19, var16);
            class263.method1788(var16, -18732, arg3, var19, var17);
            class263.method1788(var17, -18732, arg7, var19, var11);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(III)V")
    private class190(int arg0, int arg1, int arg2) {
    }
}
