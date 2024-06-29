import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class54 extends class98 {

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "Lrl;")
    public static class672 field713 = new class672(68, 8);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V")
    public static void method596(byte arg0) {
        if (arg0 != -93) {
            field713 = null;
        }
        field713 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
    public static final void method597(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field714++;
        for (class119 var5 = (class119) class675.field9520.method3465((byte) -86); var5 != null; var5 = (class119) class675.field9520.method3469(0)) {
            class49.method564(var5, arg3, 0, arg4, arg2, arg0);
        }
        if (arg1 <= 17) {
            return;
        }
        for (class119 var6 = (class119) class235.field3738.method3465((byte) 124); var6 != null; var6 = (class119) class235.field3738.method3469(0)) {
            byte var12 = 1;
            class642 var13 = var6.field1918.method1856(1208);
            if (var6.field1918.field4183 == -1 || var6.field1918.field4217) {
                var12 = 0;
            } else if (var6.field1918.field4183 == var13.field9024 || var6.field1918.field4183 == var13.field9042 || var6.field1918.field4183 == var13.field9011 || var6.field1918.field4183 == var13.field9046) {
                var12 = 2;
            } else if (var6.field1918.field4183 == var13.field9002 || var6.field1918.field4183 == var13.field9023 || var6.field1918.field4183 == var13.field9029 || var6.field1918.field4183 == var13.field9015) {
                var12 = 3;
            }
            if (var6.field1930 != var12) {
                int var14 = class20.method361(112, var6.field1918);
                class705 var15 = var6.field1918.field8354;
                if (var15.field9912 != null) {
                    var15 = var15.method3973(true, class539.field7869);
                }
                if (var15 == null || var14 == -1) {
                    var6.field1923 = -1;
                    var6.field1930 = var12;
                    var6.field1928 = false;
                } else if (var6.field1923 == var14 && var6.field1928 == var15.field9976) {
                    var6.field1930 = var12;
                    var6.field1920 = var15.field9933;
                } else {
                    boolean var16 = false;
                    if (var6.field1911 == null) {
                        var16 = true;
                    } else {
                        var6.field1920 -= 512;
                        if (var6.field1920 <= 0) {
                            class505.field7381.method1985(var6.field1911);
                            var6.field1911 = null;
                            var16 = true;
                        }
                    }
                    if (var16) {
                        var6.field1922 = null;
                        var6.field1930 = var12;
                        var6.field1920 = var15.field9933;
                        var6.field1928 = var15.field9976;
                        var6.field1923 = var14;
                        var6.field1908 = null;
                    }
                }
            }
            var6.field1902 = var6.field1918.field9696;
            var6.field1924 = var6.field1918.field9696 + (var6.field1918.method1841(20744) << 8);
            var6.field1904 = var6.field1918.field9705;
            var6.field1925 = var6.field1918.field9705 + (var6.field1918.method1841(20744) << 8);
            class49.method564(var6, arg3, 0, arg4, arg2, arg0);
        }
        for (class119 var7 = (class119) class415.field6359.method1556(84); var7 != null; var7 = (class119) class415.field6359.method1559(77)) {
            byte var8 = 1;
            class642 var9 = var7.field1907.method1856(1208);
            if (var7.field1907.field4183 == -1 || var7.field1907.field4217) {
                var8 = 0;
            } else if (var7.field1907.field4183 == var9.field9024 || var7.field1907.field4183 == var9.field9042 || var7.field1907.field4183 == var9.field9011 || var7.field1907.field4183 == var9.field9046) {
                var8 = 2;
            } else if (var7.field1907.field4183 == var9.field9002 || var7.field1907.field4183 == var9.field9023 || var7.field1907.field4183 == var9.field9029 || var7.field1907.field4183 == var9.field9015) {
                var8 = 3;
            }
            if (var7.field1930 != var8) {
                int var10 = class174.method1418((byte) -103, var7.field1907);
                if (var7.field1923 == var10 && var7.field1928 == var7.field1907.field4766) {
                    var7.field1920 = var7.field1907.field4786;
                    var7.field1930 = var8;
                } else {
                    boolean var11 = false;
                    if (var7.field1911 == null) {
                        var11 = true;
                    } else {
                        var7.field1920 -= 512;
                        if (var7.field1920 <= 0) {
                            class505.field7381.method1985(var7.field1911);
                            var11 = true;
                            var7.field1911 = null;
                        }
                    }
                    if (var11) {
                        var7.field1930 = var8;
                        var7.field1920 = var7.field1907.field4786;
                        var7.field1923 = var10;
                        var7.field1928 = var7.field1907.field4766;
                        var7.field1908 = null;
                        var7.field1922 = null;
                    }
                }
            }
            var7.field1902 = var7.field1907.field9696;
            var7.field1924 = var7.field1907.field9696 + (var7.field1907.method1841(20744) << 8);
            var7.field1904 = var7.field1907.field9705;
            var7.field1925 = var7.field1907.field9705 + (var7.field1907.method1841(20744) << 8);
            class49.method564(var7, arg3, 0, arg4, arg2, arg0);
        }
    }
}
