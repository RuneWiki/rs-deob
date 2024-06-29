import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class120 implements class209 {

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    private int field1956 = 50;

    @OriginalMember(owner = "client!lf", name = "L", descriptor = "Z")
    private boolean field1978 = false;

    @OriginalMember(owner = "client!lf", name = "M", descriptor = "Loh;")
    private class15 field1979;

    @OriginalMember(owner = "client!lf", name = "P", descriptor = "Loh;")
    private class15 field1982;

    @OriginalMember(owner = "client!lf", name = "J", descriptor = "Lhf;")
    private class195 field1976;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "Lhf;")
    private class195 field1965;

    @OriginalMember(owner = "client!lf", name = "B", descriptor = "[B")
    private byte[] field1968;

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "[Z")
    private boolean[] field1955;

    @OriginalMember(owner = "client!lf", name = "A", descriptor = "[Z")
    private boolean[] field1967;

    @OriginalMember(owner = "client!lf", name = "O", descriptor = "[Z")
    private boolean[] field1981;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "[S")
    private short[] field1941;

    @OriginalMember(owner = "client!lf", name = "R", descriptor = "[Z")
    private boolean[] field1984;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "[Z")
    private boolean[] field1962;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "[B")
    private byte[] field1951;

    @OriginalMember(owner = "client!lf", name = "N", descriptor = "[B")
    private byte[] field1980;

    @OriginalMember(owner = "client!lf", name = "I", descriptor = "[B")
    private byte[] field1975;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!lf", name = "H", descriptor = "I")
    public static int field1974 = 0;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "Lok;")
    public static class146 field1942 = class235.method1724(-12908, "Versteckt");

    @OriginalMember(owner = "client!lf", name = "K", descriptor = "I")
    public static int field1977 = 0;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!lf", name = "z", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!lf", name = "C", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!lf", name = "D", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!lf", name = "E", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!lf", name = "F", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!lf", name = "G", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!lf", name = "Q", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(II)Z", line = 11)
    public final boolean method817(int arg0, int arg1) {
        if (arg1 != -2) {
            this.method817(73, 81);
        }
        field1959++;
        return this.field1955[arg0];
    }

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "(IB)Lhg;", line = 34)
    private final class167 method818(int arg0, byte arg1) {
        field1972++;
        class167 var3 = (class167) this.field1965.method1511((long) arg0, arg1 + 120);
        if (arg1 != -38) {
            this.field1956 = 14;
        }
        if (var3 == null) {
            class167 var4 = new class167(this.field1941[arg0] & 0xFFFF);
            this.field1965.method1509((long) arg0, 53, var4);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(II)Lp;", line = 52)
    private final class96 method819(int arg0, int arg1) {
        field1961++;
        class96 var3 = (class96) this.field1976.method1511((long) arg0, 104);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field1979.method92(arg0, 0, 0);
        if (var4 == null) {
            return null;
        }
        if (arg1 > -58) {
            this.method819(-120, -62);
        }
        class47 var5 = new class47(var4);
        class96 var6 = new class96(var5);
        this.field1976.method1509((long) arg0, 54, var6);
        return var6;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B[B)Z", line = 79)
    public static final boolean method820(byte arg0, byte[] arg1) {
        if (arg0 <= 81) {
            field1977 = -94;
        }
        field1950++;
        class47 var2 = new class47(arg1);
        int var3 = var2.method368(88);
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method368(-118) == 1;
        if (var4) {
            class287.method2072(true, var2);
        }
        class89.method617(var2, 25527);
        return true;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 105)
    public final void method821(byte arg0) {
        if (arg0 >= -26) {
            this.field1956 = 27;
        }
        field1944++;
        this.field1976.method1510((byte) -122);
        if (this.field1965 != null) {
            this.field1965.method1510((byte) -125);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IB)I", line = 120)
    public final int method822(int arg0, byte arg1) {
        field1946++;
        return arg1 < 26 ? 60 : this.field1980[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(II)Z", line = 142)
    public final boolean method823(int arg0, int arg1) {
        field1971++;
        class96 var3 = this.method819(arg1, arg0 ^ 0xFFFFFF76);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 != 255) {
                this.field1980 = (byte[]) null;
            }
            return var3.method667(this.field1982, this, -1);
        }
    }

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "(IB)I", line = 159)
    public final int method824(int arg0, byte arg1) {
        field1945++;
        return arg1 == 5 ? this.field1951[arg0] & 0xFF : 76;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZI)Z", line = 170)
    public final boolean method825(boolean arg0, int arg1) {
        if (!arg0) {
            this.field1982 = (class15) null;
        }
        field1954++;
        return this.field1981[arg1];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ZB)V", line = 185)
    public final void method826(boolean arg0, byte arg1) {
        this.field1978 = arg0;
        if (arg1 <= 20) {
            this.field1980 = (byte[]) null;
        }
        field1958++;
        this.method821((byte) -50);
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(II)[I", line = 197)
    public final int[] method827(int arg0, int arg1) {
        field1949++;
        class96 var3 = this.method819(arg0, -104);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -31859) {
                this.field1978 = false;
            }
            return var3.method662(this, this.field1978 || this.field1967[arg0], arg1 ^ 0xFFFF83CD, this.field1982);
        }
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(II)I", line = 213)
    public final int method828(int arg0, int arg1) {
        if (arg0 == -12560) {
            field1983++;
            return this.field1975[arg1] & 0xFF;
        } else {
            return 27;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BLoh;)I", line = 226)
    public static final int method829(byte arg0, class15 arg1) {
        field1964++;
        int var2 = 0;
        if (arg1.method117(-32236, class83.field1319)) {
            var2++;
        }
        if (arg1.method117(-32236, class99.field1608)) {
            var2++;
        }
        if (arg1.method117(-32236, class76.field1231)) {
            var2++;
        }
        if (arg1.method117(-32236, class249.field4176)) {
            var2++;
        }
        if (arg1.method117(-32236, class62.field1059)) {
            var2++;
        }
        if (arg1.method117(-32236, class168.field2839)) {
            var2++;
        }
        if (arg0 > -40) {
            field1953 = -98;
        }
        if (arg1.method117(-32236, class134.field2245)) {
            var2++;
        }
        if (arg1.method117(-32236, class1.field3)) {
            var2++;
        }
        if (arg1.method117(-32236, class239.field3984)) {
            var2++;
        }
        if (arg1.method117(-32236, class222.field3697)) {
            var2++;
        }
        if (arg1.method117(-32236, class211.field3499)) {
            var2++;
        }
        if (arg1.method117(-32236, class91.field1447)) {
            var2++;
        }
        if (arg1.method117(-32236, class160.field2700)) {
            var2++;
        }
        if (arg1.method117(-32236, class311.field5303)) {
            var2++;
        }
        if (arg1.method117(-32236, class140.field2335)) {
            var2++;
        }
        if (arg1.method117(-32236, class189.field3135)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "(IB)V", line = 302)
    public final void method830(int arg0, byte arg1) {
        field1973++;
        int var3 = 2 % ((arg1 - 61) / 61);
        boolean var4 = false;
        class140.method1033(this.field1951[arg0] & 0xFF, this.field1980[arg0] & 0xFF, -5);
        class96 var5 = this.method819(arg0, -83);
        if (var5 != null) {
            var4 = var5.method666(this.field1982, -1384136568, this, this.field1978 || this.field1967[arg0]);
        }
        if (!var4) {
            class167 var6 = this.method818(arg0, (byte) -38);
            var6.method1293(13859);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIF)[I", line = 338)
    public final int[] method831(byte arg0, int arg1, float arg2) {
        field1963++;
        class96 var4 = this.method819(arg1, -78);
        if (arg0 <= 35) {
            this.method818(94, (byte) 54);
        }
        if (var4 == null) {
            return null;
        } else {
            var4.field1570 = true;
            return var4.method660(this.field1978 || this.field1967[arg1], (byte) -115, this.field1982, arg2, this);
        }
    }

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "(II)V", line = 358)
    public final void method832(int arg0, int arg1) {
        if (arg0 != 0) {
            method836(-103);
        }
        for (class96 var3 = (class96) this.field1976.method1501(58); var3 != null; var3 = (class96) this.field1976.method1507(true)) {
            if (var3.field1570) {
                var3.method668(115, arg1);
                var3.field1570 = false;
            }
        }
        field1947++;
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(Loh;Loh;Loh;IZ)V", line = 534)
    public class120(class15 arg0, class15 arg1, class15 arg2, int arg3, boolean arg4) {
        this.field1978 = arg4;
        this.field1956 = arg3;
        this.field1979 = arg0;
        this.field1982 = arg2;
        this.field1976 = new class195(this.field1956);
        if (class271.field4640) {
            this.field1965 = new class195(this.field1956);
        } else {
            this.field1965 = null;
        }
        class47 var6 = new class47(arg1.method92(0, 0, 0));
        int var7 = var6.method379(-2);
        this.field1968 = new byte[var7];
        this.field1955 = new boolean[var7];
        this.field1967 = new boolean[var7];
        this.field1981 = new boolean[var7];
        this.field1941 = new short[var7];
        this.field1984 = new boolean[var7];
        this.field1962 = new boolean[var7];
        this.field1951 = new byte[var7];
        this.field1980 = new byte[var7];
        this.field1975 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field1984[var8] = var6.method368(97) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field1984[var9]) {
                this.field1981[var9] = var6.method368(-108) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field1984[var10]) {
                this.field1955[var10] = var6.method368(-93) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field1984[var11]) {
                this.field1967[var11] = var6.method368(-101) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field1984[var12]) {
                this.field1962[var12] = var6.method368(116) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field1984[var13]) {
                this.field1975[var13] = var6.method352(255);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field1984[var14]) {
                this.field1968[var14] = var6.method352(255);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field1984[var15]) {
                this.field1980[var15] = var6.method352(255);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field1984[var16]) {
                this.field1951[var16] = var6.method352(255);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field1984[var17]) {
                this.field1941[var17] = (short) var6.method379(-2);
            }
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(ZI)I", line = 386)
    public final int method833(boolean arg0, int arg1) {
        if (arg0) {
            this.field1962 = (boolean[]) null;
        }
        field1969++;
        return this.field1941[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(II)Z", line = 397)
    public final boolean method834(int arg0, int arg1) {
        field1957++;
        if (this.field1978 || this.field1967[arg0]) {
            return true;
        } else {
            if (arg1 != 0) {
                this.field1965 = (class195) null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)I", line = 417)
    public final int method835(int arg0, boolean arg1) {
        if (arg1) {
            field1943++;
            return this.field1968[arg0] & 0xFF;
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 428)
    public static void method836(int arg0) {
        field1942 = null;
        if (arg0 != 0) {
            method840(-19, (class224) null, 96);
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(IB)Z", line = 438)
    public final boolean method837(int arg0, byte arg1) {
        field1952++;
        if (arg1 != -11) {
            method840(-54, (class224) null, 111);
        }
        return this.field1962[arg0];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IJ)V", line = 449)
    public static final void method838(int arg0, long arg1) {
        field1966++;
        if (arg1 == 0L) {
            return;
        }
        if (class102.field1653 >= 100) {
            class316.method2209(false, class273.field4678, 0, class161.field2740);
            return;
        }
        class146 var3 = class267.method1938(64, arg1).method1104((byte) -90);
        for (int var4 = 0; var4 < class102.field1653; var4++) {
            if (class106.field1715[var4] == arg1) {
                class316.method2209(false, class112.method758(-68, new class146[] { var3, class234.field3917 }), 0, class161.field2740);
                return;
            }
        }
        for (int var5 = 0; var5 < class226.field3772; var5++) {
            if (class144.field2417[var5] == arg1) {
                class316.method2209(false, class112.method758(121, new class146[] { class102.field1654, var3, class242.field4019 }), 0, class161.field2740);
                return;
            }
        }
        if (var3.method1100((byte) -113, class102.field1639.field3891)) {
            class316.method2209(false, class64.field1103, 0, class161.field2740);
            return;
        }
        class21.field394++;
        class106.field1715[class102.field1653] = arg1;
        class73.field1184[class102.field1653++] = class267.method1938(arg0 + 1300, arg1);
        class150.field2550 = class13.field253;
        if (arg0 != -1249) {
            field1974 = 16;
        }
        class47.field820.method1656(60, 16);
        class47.field820.method359(arg1, arg0 + 1377);
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(IB)V", line = 659)
    public final void method839(int arg0, byte arg1) {
        this.field1956 = arg0;
        field1960++;
        this.field1976 = new class195(this.field1956);
        int var3 = -3 % ((-arg1 - 20) / 33);
        if (class271.field4640) {
            this.field1965 = new class195(this.field1956);
        } else {
            this.field1965 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(ILgj;I)V", line = 678)
    public static final void method840(int arg0, class224 arg1, int arg2) {
        field1948++;
        int var3 = -65 % ((arg2 - 75) / 50);
        while (true) {
            class80 var4 = (class80) class182.field3054.method1251(-69);
            if (var4 == null) {
                return;
            }
            boolean var5 = false;
            for (int var6 = 0; var6 < var4.field1284; var6++) {
                if (var4.field1290[var6] != null) {
                    if (var4.field1290[var6].field4265 == 2) {
                        var4.field1289[var6] = -5;
                    }
                    if (var4.field1290[var6].field4265 == 0) {
                        var5 = true;
                    }
                }
                if (var4.field1275[var6] != null) {
                    if (var4.field1275[var6].field4265 == 2) {
                        var4.field1289[var6] = -6;
                    }
                    if (var4.field1275[var6].field4265 == 0) {
                        var5 = true;
                    }
                }
            }
            if (var5) {
                return;
            }
            arg1.method1656(arg0, 16);
            arg1.method332(0, 98);
            int var7 = arg1.field857;
            arg1.method387(var4.field1274, 105);
            for (int var8 = 0; var8 < var4.field1284; var8++) {
                if (var4.field1289[var8] == 0) {
                    try {
                        int var9 = var4.field1282[var8];
                        if (var9 == 0) {
                            Field var10 = (Field) var4.field1290[var8].field4269;
                            int var11 = var10.getInt((Object) null);
                            arg1.method332(0, 74);
                            arg1.method387(var11, 115);
                        } else if (var9 == 1) {
                            Field var14 = (Field) var4.field1290[var8].field4269;
                            var14.setInt((Object) null, var4.field1287[var8]);
                            arg1.method332(0, 95);
                        } else if (var9 == 2) {
                            Field var12 = (Field) var4.field1290[var8].field4269;
                            int var13 = var12.getModifiers();
                            arg1.method332(0, 73);
                            arg1.method387(var13, 96);
                        }
                        if (var9 == 3) {
                            Method var15 = (Method) var4.field1275[var8].field4269;
                            byte[][] var16 = var4.field1281[var8];
                            Object[] var17 = new Object[var16.length];
                            for (int var18 = 0; var18 < var16.length; var18++) {
                                ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                var17[var18] = var19.readObject();
                            }
                            Object var20 = var15.invoke((Object) null, var17);
                            if (var20 == null) {
                                arg1.method332(0, 122);
                            } else if (var20 instanceof Number) {
                                arg1.method332(1, 118);
                                arg1.method359(((Number) var20).longValue(), 128);
                            } else if (var20 instanceof class146) {
                                arg1.method332(2, 91);
                                arg1.method339(-106, (class146) var20);
                            } else {
                                arg1.method332(4, 78);
                            }
                        } else if (var9 == 4) {
                            Method var21 = (Method) var4.field1275[var8].field4269;
                            int var22 = var21.getModifiers();
                            arg1.method332(0, 97);
                            arg1.method387(var22, 116);
                        }
                    } catch (ClassNotFoundException var35) {
                        arg1.method332(-10, 92);
                    } catch (InvalidClassException var36) {
                        arg1.method332(-11, 93);
                    } catch (StreamCorruptedException var37) {
                        arg1.method332(-12, 124);
                    } catch (OptionalDataException var38) {
                        arg1.method332(-13, 68);
                    } catch (IllegalAccessException var39) {
                        arg1.method332(-14, 76);
                    } catch (IllegalArgumentException var40) {
                        arg1.method332(-15, 126);
                    } catch (InvocationTargetException var41) {
                        arg1.method332(-16, 89);
                    } catch (SecurityException var42) {
                        arg1.method332(-17, 92);
                    } catch (IOException var43) {
                        arg1.method332(-18, 75);
                    } catch (NullPointerException var44) {
                        arg1.method332(-19, 68);
                    } catch (Exception var45) {
                        arg1.method332(-20, 78);
                    } catch (Throwable var46) {
                        arg1.method332(-21, 97);
                    }
                } else {
                    arg1.method332(var4.field1289[var8], 97);
                }
            }
            arg1.method367(var7, 116);
            arg1.method331(-85, arg1.field857 - var7);
            var4.method1325(-2935);
        }
    }
}
