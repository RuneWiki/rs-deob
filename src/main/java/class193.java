import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class193 implements class40 {

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[S")
    public static short[] field3385 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field3387 = -1;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Lsc;")
    public static class181 field3388 = class149.method967(255, "Stufe)2");

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field3386;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static final void method1322(int arg0) {
        class52.field835 = arg0;
        for (int var1 = 0; var1 < class238.field4129; var1++) {
            for (int var2 = 0; var2 < class2.field47; var2++) {
                if (class221.field3820[arg0][var1][var2] == null) {
                    class221.field3820[arg0][var1][var2] = new class220(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lo;ILsc;)Lsc;")
    public static final class181 method1323(class175 arg0, int arg1, class181 arg2) {
        if (arg2.method1220((byte) -89, class198.field3442) != -1) {
            label58: while (true) {
                int var3 = arg2.method1220((byte) -79, class31.field510);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method1220((byte) -112, class241.field4188);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method1220((byte) -51, class138.field2258);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method1220((byte) -68, class82.field1309);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method1220((byte) -99, class225.field3879);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method1220((byte) -58, class160.field2729);
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        class181 var9 = class241.field4187;
                                                        if (class131.field2174 != null) {
                                                            var9 = class237.method1622(13, class131.field2174.field1932);
                                                            try {
                                                                if (class131.field2174.field1935 != null) {
                                                                    byte[] var10 = ((String) class131.field2174.field1935).getBytes("ISO-8859-1");
                                                                    var9 = class1.method9(0, -1, var10.length, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg2 = class175.method1164(new class181[] { arg2.method1235(0, 109, var8), var9, arg2.method1215(113, var8 + 4) }, (byte) 123);
                                                    }
                                                }
                                                arg2 = class175.method1164(new class181[] { arg2.method1235(0, 118, var7), class99.method656(class111.method739((byte) 114, arg0, 4), -120), arg2.method1215(117, var7 + 2) }, (byte) 127);
                                            }
                                        }
                                        arg2 = class175.method1164(new class181[] { arg2.method1235(0, 94, var6), class99.method656(class111.method739((byte) -69, arg0, 3), -101), arg2.method1215(104, var6 + 2) }, (byte) 127);
                                    }
                                }
                                arg2 = class175.method1164(new class181[] { arg2.method1235(0, 104, var5), class99.method656(class111.method739((byte) 123, arg0, 2), -123), arg2.method1215(127, var5 + 2) }, (byte) 123);
                            }
                        }
                        arg2 = class175.method1164(new class181[] { arg2.method1235(0, 105, var4), class99.method656(class111.method739((byte) 108, arg0, 1), -102), arg2.method1215(107, var4 + 2) }, (byte) 126);
                    }
                }
                arg2 = class175.method1164(new class181[] { arg2.method1235(0, 93, var3), class99.method656(class111.method739((byte) -48, arg0, 0), -108), arg2.method1215(121, var3 + 2) }, (byte) 123);
            }
        }
        field3383++;
        int var11 = 43 / ((-arg1 - 33) / 57);
        return arg2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static void method1324(boolean arg0) {
        field3388 = null;
        if (arg0) {
            field3385 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lrb;BLrb;)V")
    public static final void method1325(class41 arg0, byte arg1, class41 arg2) {
        if (arg2.field618 != null) {
            arg2.method290((byte) -48);
        }
        int var3 = 112 / ((arg1 - 61) / 60);
        arg2.field605 = arg0;
        arg2.field618 = arg0.field618;
        field3382++;
        arg2.field618.field605 = arg2;
        arg2.field605.field618 = arg2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(JII[I)Lsc;")
    public final class181 method285(long arg0, int arg1, int arg2, int[] arg3) {
        field3384++;
        if (arg1 == 0) {
            class136 var6 = class51.method382(true, arg3[0]);
            return var6.method874((byte) 45, (int) arg0);
        } else if (arg1 == 1 || arg1 == 10) {
            class99 var7 = class237.method1620(-29539, (int) arg0);
            return var7.field1652;
        } else if (arg1 == arg2 || arg1 == 7) {
            return class51.method382(true, arg3[0]).method874((byte) 113, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lsc;BI)V")
    public static final void method1326(class181 arg0, byte arg1, int arg2) {
        class206.field3549++;
        field3381++;
        class141.field2275.method541(101, -124);
        class141.field2275.method1509(false, arg0.method1197(-110));
        class141.field2275.method1525(arg2, -116);
        int var3 = -47 / ((-arg1 - 41) / 60);
    }
}
