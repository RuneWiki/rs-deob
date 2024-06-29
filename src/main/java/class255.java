import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class255 extends OutputStream {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "[[I")
    public static int[][] field3722 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3720;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field3721;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field3723;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([Luv;II)V")
    public static final void method1734(class755[] arg0, int arg1, int arg2) {
        field3723++;
        if (arg2 > -87) {
            method1736(false);
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class755 var4 = arg0[var3];
            if (var4 != null && var4.field10552 == arg1 && !client.method2751(var4)) {
                if (var4.field10416 == 0) {
                    method1734(arg0, var4.field10445, -103);
                    if (var4.field10503 != null) {
                        method1734(var4.field10503, var4.field10445, -98);
                    }
                    class654 var5 = (class654) class259.field3747.method812(114, (long) var4.field10445);
                    if (var5 != null) {
                        class323.method2075(-19180, var5.field8745);
                    }
                }
                if (var4.field10416 == 6 && var4.field10498 != -1) {
                    class57 var6 = class607.field8188.method3001(-12575, var4.field10498);
                    if (var6 != null) {
                        var4.field10425 += class449.field6216;
                        int var7 = var4.field10465;
                        while (var4.field10425 > var6.field813[var4.field10465]) {
                            var4.field10425 -= var6.field813[var4.field10465];
                            var4.field10465++;
                            if (var6.field821.length <= var4.field10465) {
                                var4.field10465 -= var6.field806;
                                if (var4.field10465 < 0 || var4.field10465 >= var6.field821.length) {
                                    var4.field10465 = 0;
                                }
                            }
                            var4.field10549 = var4.field10465 + 1;
                            if (var6.field821.length <= var4.field10549) {
                                var4.field10549 -= var6.field806;
                                if (var4.field10549 < 0 || var4.field10549 >= var6.field821.length) {
                                    var4.field10549 = -1;
                                }
                            }
                            class27.method159((byte) -105, var4);
                        }
                        if (var4.field10465 != var7) {
                            class401.method2499(var6, var4.field10465, -26802);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLdc;)V")
    public static final void method1735(boolean arg0, class63 arg1) {
        field3720++;
        byte[] var2 = new byte[24];
        if (class630.field8466 != null) {
            try {
                class630.field8466.method79(0L, (byte) -128);
                class630.field8466.method83(var2, 114);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method497(var2, 24, 0, -1);
        if (!arg0) {
            method1734(null, -30, -119);
        }
    }

    @OriginalMember(owner = "client!wb", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field3721++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public static void method1736(boolean arg0) {
        if (!arg0) {
            method1736(false);
        }
        field3722 = null;
    }
}
