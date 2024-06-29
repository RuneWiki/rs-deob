import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 {

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[I")
    public static int[] field371 = new int[50];

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field367;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BLie;I)V")
    public final void method193(byte[] arg0, class32 arg1, int arg2) {
        field372++;
        if (arg2 != -14) {
            field371 = null;
        }
        if (arg1.field644[arg1.field647] != 31 || arg1.field644[arg1.field647 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field367 == null) {
            this.field367 = new Inflater(true);
        }
        try {
            this.field367.setInput(arg1.field644, arg1.field647 + 10, -arg1.field647 + -10 + arg1.field644.length - 8);
            this.field367.inflate(arg0);
        } catch (Exception var4) {
            this.field367.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field367.reset();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)Lvb;")
    public static final class59 method194(byte arg0) {
        if (arg0 <= 103) {
            field371 = null;
        }
        field368++;
        try {
            return (class59) Class.forName("vd").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
    public static final void method195(int arg0, int arg1) {
        field366++;
        if (arg0 < 0) {
            return;
        }
        int var2 = class119.field2089[arg0];
        int var3 = class135.field2358[arg0];
        int var4 = (int) class35.field760[arg0];
        int var5 = class235.field4090[arg0];
        if (var5 >= 2000) {
            var5 -= 2000;
        }
        long var6 = class35.field760[arg0];
        if (var5 == 25) {
            class54.method479(0);
            class141 var8 = class70.method572(20043, var3);
            class112.field1960 = var2;
            class195.field3400 = var4;
            class113.field1977 = var3;
            class70.field1376 = 1;
            class128.method911(var8, arg1 - 48189);
            class28.field544 = class238.method1626(new class237[] { class152.field2700, class112.method829((byte) -82, var4).field131, class85.field1582 }, -54);
            if (class28.field544 == null) {
                class28.field544 = class32.field673;
            }
            return;
        }
        if (var5 == 32) {
            class70.method569(true, var2, var6, var3);
            class223.field3830.method368(-19, 40);
            class223.field3830.method350((byte) 19, class27.field494 + var3);
            class223.field3830.method344(class235.field4087 + var2, arg1 + -904710712);
            class259.field4443++;
            class223.field3830.method341(26994, (int) (var6 >>> 32) & Integer.MAX_VALUE);
        }
        if (var5 == 59) {
            class271 var9 = class232.field4025[var4];
            if (var9 != null) {
                class138.field2385++;
                class210.method1406(0, 1, var9.field3743[0], var9.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class203.field3487 = class227.field3891;
                class36.field796 = class58.field1196;
                class135.field2351 = 0;
                class36.field788 = 2;
                class223.field3830.method368(119, 132);
                class223.field3830.method341(26994, var4);
            }
        }
        if (var5 == 45) {
            class271 var10 = class232.field4025[var4];
            if (var10 != null) {
                class210.method1406(0, 1, var10.field3743[0], var10.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class203.field3487 = class227.field3891;
                class135.field2351 = 0;
                class36.field796 = class58.field1196;
                class34.field736++;
                class36.field788 = 2;
                class223.field3830.method368(arg1 - 31139, 149);
                class223.field3830.method341(26994, class112.field1960);
                class223.field3830.method290((byte) -20, class113.field1977);
                class223.field3830.method341(26994, class195.field3400);
                class223.field3830.method348(var4, arg1 - 31036);
            }
        }
        if (var5 == 50) {
            class8.field110++;
            boolean var11 = class210.method1406(0, 0, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 0);
            if (!var11) {
                class210.method1406(0, 1, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
            }
            class36.field788 = 2;
            class135.field2351 = 0;
            class36.field796 = class58.field1196;
            class203.field3487 = class227.field3891;
            class223.field3830.method368(126, 48);
            class223.field3830.method341(26994, class187.field3272);
            class223.field3830.method348(class235.field4087 + var2, 4);
            class223.field3830.method341(26994, var3 + class27.field494);
            class223.field3830.method329(class144.field2606, (byte) 97);
            class223.field3830.method350((byte) 19, var4);
        }
        if (var5 == 5 && class70.method569(true, var2, var6, var3)) {
            class73.field1403++;
            class223.field3830.method368(-114, 113);
            class223.field3830.method341(26994, class195.field3400);
            class223.field3830.method344(class112.field1960, -904679672);
            class223.field3830.method350((byte) 19, var2 + class235.field4087);
            class223.field3830.method348(class27.field494 + var3, 4);
            class223.field3830.method329(class113.field1977, (byte) 97);
            class223.field3830.method348(Integer.MAX_VALUE & (int) (var6 >>> 32), 4);
        }
        if (var5 == 49) {
            class271 var13 = class232.field4025[var4];
            if (var13 != null) {
                class210.method1406(0, 1, var13.field3743[0], var13.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class36.field788 = 2;
                class36.field796 = class58.field1196;
                class203.field3487 = class227.field3891;
                class202.field3472++;
                class135.field2351 = 0;
                class223.field3830.method368(87, 222);
                class223.field3830.method350((byte) 19, var4);
            }
        }
        if (var5 == 26) {
            class210 var14 = class232.field4022[var4];
            if (var14 != null) {
                class210.method1406(0, 1, var14.field3743[0], var14.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class36.field796 = class58.field1196;
                class203.field3487 = class227.field3891;
                class87.field1592++;
                class135.field2351 = 0;
                class36.field788 = 2;
                class223.field3830.method368(1, 154);
                class223.field3830.method344(class112.field1960, -904679672);
                class223.field3830.method331(class113.field1977, (byte) -109);
                class223.field3830.method350((byte) 19, var4);
                class223.field3830.method344(class195.field3400, -904679672);
            }
        }
        if (var5 == 46 || var5 == 1004) {
            class31.method288(5, var4, class215.field3747[arg0], var3, var2);
        }
        if (var5 == 13) {
            class91.field1652++;
            boolean var15 = class210.method1406(0, 0, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 0);
            if (!var15) {
                class210.method1406(0, 1, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
            }
            class135.field2351 = 0;
            class36.field796 = class58.field1196;
            class203.field3487 = class227.field3891;
            class36.field788 = 2;
            class223.field3830.method368(-112, 162);
            class223.field3830.method348(var2 + class235.field4087, 4);
            class223.field3830.method350((byte) 19, class112.field1960);
            class223.field3830.method341(26994, var4);
            class223.field3830.method348(class195.field3400, 4);
            class223.field3830.method344(var3 + class27.field494, -904679672);
            class223.field3830.method337(false, class113.field1977);
        }
        if (var5 == 40) {
            class56.field1151++;
            class223.field3830.method368(-119, 108);
            class223.field3830.method290((byte) -20, var3);
            class141 var17 = class70.method572(20043, var3);
            if (var17.field2459 != null && var17.field2459[0][0] == 5) {
                int var18 = var17.field2459[0][1];
                class202.field3471[var18] = 1 - class202.field3471[var18];
                class76.method592((byte) -87, var18);
            }
        }
        if (var5 == 44) {
            class141 var19 = class61.method519(var2, arg1 ^ 0x7940, var3);
            if (var19 != null) {
                class54.method479(0);
                class164.method1151(class92.method694(client.method1042(var19), (byte) -7), arg1 ^ 0x7932, var2, var3);
                class70.field1376 = 0;
                class203.field3481 = class115.method848(-106, var19);
                if (class203.field3481 == null) {
                    class203.field3481 = class8.field184;
                }
                if (var19.field2536) {
                    class181.field3177 = class238.method1626(new class237[] { var19.field2485, class85.field1582 }, -125);
                    return;
                }
                class181.field3177 = class238.method1626(new class237[] { class65.field1289, var19.field2475, class85.field1582 }, arg1 ^ 0xFFFF86D2);
            }
            return;
        }
        if (var5 == 19 && class83.field1552 == null) {
            class155.method1068(115, var2, var3);
            class83.field1552 = class61.method519(var2, 0, var3);
            class128.method911(class83.field1552, arg1 - 48189);
        }
        if (var5 == 31) {
            boolean var20 = class210.method1406(0, 0, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 0);
            if (!var20) {
                class210.method1406(0, 1, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
            }
            class36.field796 = class58.field1196;
            class135.field2351 = 0;
            class87.field1601++;
            class203.field3487 = class227.field3891;
            class36.field788 = 2;
            class223.field3830.method368(arg1 ^ 0xFFFF86D3, 202);
            class223.field3830.method350((byte) 19, class235.field4087 + var2);
            class223.field3830.method344(var4, -904679672);
            class223.field3830.method348(class27.field494 + var3, arg1 ^ 0x7944);
        }
        if (var5 == 7) {
            class187.field3271++;
            boolean var22 = class210.method1406(0, 0, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 0);
            if (!var22) {
                class210.method1406(0, 1, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
            }
            class36.field796 = class58.field1196;
            class36.field788 = 2;
            class203.field3487 = class227.field3891;
            class135.field2351 = 0;
            class223.field3830.method368(-118, 183);
            class223.field3830.method348(var3 + class27.field494, 4);
            class223.field3830.method348(var4, 4);
            class223.field3830.method350((byte) 19, class235.field4087 + var2);
        }
        if (var5 == 29) {
            class271 var24 = class232.field4025[var4];
            if (var24 != null) {
                class210.method1406(0, 1, var24.field3743[0], var24.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class203.field3487 = class227.field3891;
                class36.field796 = class58.field1196;
                class143.field2592++;
                class135.field2351 = 0;
                class36.field788 = 2;
                class223.field3830.method368(-103, 2);
                class223.field3830.method290((byte) -20, class144.field2606);
                class223.field3830.method350((byte) 19, class187.field3272);
                class223.field3830.method341(26994, var4);
            }
        }
        if (var5 == 23) {
            class271 var25 = class232.field4025[var4];
            if (var25 != null) {
                class193.field3339++;
                class210.method1406(0, 1, var25.field3743[0], var25.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class135.field2351 = 0;
                class203.field3487 = class227.field3891;
                class36.field788 = 2;
                class36.field796 = class58.field1196;
                class223.field3830.method368(arg1 ^ 0xFFFF86D5, 115);
                class223.field3830.method348(var4, 4);
            }
        }
        if (var5 == 17) {
            class223.field3830.method368(-120, 63);
            class247.field4301++;
            class223.field3830.method350((byte) 19, var2);
            class223.field3830.method290((byte) -20, class113.field1977);
            class223.field3830.method341(26994, var4);
            class223.field3830.method329(var3, (byte) 97);
            class223.field3830.method344(class112.field1960, -904679672);
            class223.field3830.method350((byte) 19, class195.field3400);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 18) {
            class210 var26 = class232.field4022[var4];
            if (var26 != null) {
                class210.method1406(0, 1, var26.field3743[0], var26.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class36.field796 = class58.field1196;
                class135.field2351 = 0;
                class203.field3487 = class227.field3891;
                class36.field788 = 2;
                class159.field2867++;
                class223.field3830.method368(123, 44);
                class223.field3830.method344(var4, -904679672);
            }
        }
        if (var5 == 11) {
            class167.field2956++;
            boolean var27 = class210.method1406(0, 0, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 0);
            if (!var27) {
                class210.method1406(0, 1, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
            }
            class36.field788 = 2;
            class203.field3487 = class227.field3891;
            class36.field796 = class58.field1196;
            class135.field2351 = 0;
            class223.field3830.method368(-126, 199);
            class223.field3830.method350((byte) 19, var2 + class235.field4087);
            class223.field3830.method344(var4, arg1 ^ 0xCA13D648);
            class223.field3830.method348(class27.field494 + var3, 4);
        }
        if (var5 == 42) {
            class271 var29 = class232.field4025[var4];
            if (var29 != null) {
                class210.method1406(0, 1, var29.field3743[0], var29.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class36.field788 = 2;
                class135.field2351 = 0;
                class230.field3937++;
                class36.field796 = class58.field1196;
                class203.field3487 = class227.field3891;
                class223.field3830.method368(-116, 102);
                class223.field3830.method341(26994, var4);
            }
        }
        if (var5 == 37) {
            class223.field3830.method368(-110, 47);
            class233.field4033++;
            class223.field3830.method341(arg1 - 4046, class187.field3272);
            class223.field3830.method337(false, class144.field2606);
            class223.field3830.method350((byte) 19, var2);
            class223.field3830.method337(false, var3);
        }
        if (var5 == 38) {
            class56.field1151++;
            class223.field3830.method368(-117, 108);
            class223.field3830.method290((byte) -20, var3);
            class141 var30 = class70.method572(arg1 ^ 0x370B, var3);
            if (var30.field2459 != null && var30.field2459[0][0] == 5) {
                int var31 = var30.field2459[0][1];
                if (class202.field3471[var31] != var30.field2496[0]) {
                    class202.field3471[var31] = var30.field2496[0];
                    class76.method592((byte) -87, var31);
                }
            }
        }
        if (var5 == 1002) {
            class22.field404++;
            class135.field2351 = 0;
            class36.field788 = 2;
            class203.field3487 = class227.field3891;
            class36.field796 = class58.field1196;
            class223.field3830.method368(-14, 233);
            class223.field3830.method348(var4, arg1 - 31036);
        }
        if (var5 == 47) {
            class210 var32 = class232.field4022[var4];
            if (var32 != null) {
                class210.method1406(0, 1, var32.field3743[0], var32.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class135.field2351 = 0;
                class203.field3487 = class227.field3891;
                class36.field796 = class58.field1196;
                class56.field1163++;
                class36.field788 = 2;
                class223.field3830.method368(-104, 232);
                class223.field3830.method350((byte) 19, var4);
            }
        }
        if (var5 == 4) {
            class70.method569(true, var2, var6, var3);
            class223.field3830.method368(-109, 156);
            class25.field466++;
            class223.field3830.method350((byte) 19, class27.field494 + var3);
            class223.field3830.method344(class235.field4087 + var2, -904679672);
            class223.field3830.method348(Integer.MAX_VALUE & (int) (var6 >>> 32), arg1 - 31036);
        }
        if (var5 == 39) {
            class115.field2025++;
            class223.field3830.method368(arg1 - 31034, 152);
            class223.field3830.method344(var2, -904679672);
            class223.field3830.method337(false, var3);
            class223.field3830.method350((byte) 19, var4);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 14) {
            class210 var33 = class232.field4022[var4];
            if (var33 != null) {
                class210.method1406(0, 1, var33.field3743[0], var33.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class135.field2351 = 0;
                class87.field1611++;
                class36.field796 = class58.field1196;
                class203.field3487 = class227.field3891;
                class36.field788 = 2;
                class223.field3830.method368(-97, 72);
                class223.field3830.method350((byte) 19, var4);
            }
        }
        if (var5 == 6) {
            class210 var34 = class232.field4022[var4];
            if (var34 != null) {
                class210.method1406(0, 1, var34.field3743[0], var34.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class78.field1470++;
                class36.field788 = 2;
                class36.field796 = class58.field1196;
                class203.field3487 = class227.field3891;
                class135.field2351 = 0;
                class223.field3830.method368(arg1 ^ 0xFFFF86C2, 171);
                class223.field3830.method348(var4, arg1 - 31036);
            }
        }
        if (var5 == 15) {
            class70.method569(true, var2, var6, var3);
            class120.field2111++;
            class223.field3830.method368(31, 11);
            class223.field3830.method348(Integer.MAX_VALUE & (int) (var6 >>> 32), 4);
            class223.field3830.method348(var2 + class235.field4087, 4);
            class223.field3830.method350((byte) 19, class27.field494 + var3);
        }
        if (var5 == 10) {
            class273.method1828(class274.field4798, var2, var3);
        }
        if (arg1 != 31040) {
            return;
        }
        if (var5 == 34) {
            class91.field1657 = true;
            class273.method1828(class274.field4798, var2, var3);
        }
        if (var5 == 36) {
            class271 var35 = class232.field4025[var4];
            if (var35 != null) {
                class68.field1328++;
                class210.method1406(0, 1, var35.field3743[0], var35.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class36.field796 = class58.field1196;
                class135.field2351 = 0;
                class203.field3487 = class227.field3891;
                class36.field788 = 2;
                class223.field3830.method368(arg1 ^ 0xFFFF86C4, 90);
                class223.field3830.method344(var4, -904679672);
            }
        }
        if (var5 == 41) {
            class271 var36 = class232.field4025[var4];
            if (var36 != null) {
                class210.method1406(0, 1, var36.field3743[0], var36.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class36.field796 = class58.field1196;
                class135.field2351 = 0;
                class100.field1778++;
                class36.field788 = 2;
                class203.field3487 = class227.field3891;
                class223.field3830.method368(106, 82);
                class223.field3830.method348(var4, 4);
            }
        }
        if (var5 == 12) {
            class223.field3830.method368(arg1 - 30937, 73);
            class182.field3183++;
            class223.field3830.method348(var2, 4);
            class223.field3830.method331(var3, (byte) 92);
            class223.field3830.method348(var4, 4);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 24) {
            class137.field2370++;
            class223.field3830.method368(-122, 28);
            class223.field3830.method290((byte) -20, var3);
            class223.field3830.method348(var2, 4);
            class223.field3830.method341(26994, var4);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 35) {
            boolean var37 = true;
            class141 var38 = class70.method572(20043, var3);
            if (var38.field2492 > 0) {
                var37 = class34.method365(var38, (byte) 108);
            }
            if (var37) {
                class223.field3830.method368(-120, 108);
                class56.field1151++;
                class223.field3830.method290((byte) -20, var3);
            }
        }
        if (var5 == 22) {
            class271 var39 = class232.field4025[var4];
            if (var39 != null) {
                class185.field3240++;
                class210.method1406(0, 1, var39.field3743[0], var39.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class135.field2351 = 0;
                class36.field796 = class58.field1196;
                class36.field788 = 2;
                class203.field3487 = class227.field3891;
                class223.field3830.method368(arg1 - 30990, 197);
                class223.field3830.method341(26994, var4);
            }
        }
        if (var5 == 28) {
            class210 var40 = class232.field4022[var4];
            if (var40 != null) {
                class226.field3871++;
                class210.method1406(0, 1, var40.field3743[0], var40.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class36.field796 = class58.field1196;
                class36.field788 = 2;
                class135.field2351 = 0;
                class203.field3487 = class227.field3891;
                class223.field3830.method368(37, 78);
                class223.field3830.method290((byte) -20, class144.field2606);
                class223.field3830.method348(class187.field3272, 4);
                class223.field3830.method348(var4, 4);
            }
        }
        if (var5 == 1006) {
            class36.field788 = 2;
            class135.field2351 = 0;
            class36.field796 = class58.field1196;
            class203.field3487 = class227.field3891;
            class210 var41 = class232.field4022[var4];
            if (var41 != null) {
                class231 var42 = var41.field3586;
                if (var42.field3991 != null) {
                    var42 = var42.method1530(-1);
                }
                if (var42 != null) {
                    class223.field3830.method368(44, 206);
                    class231.field3955++;
                    class223.field3830.method348(var42.field3970, 4);
                }
            }
        }
        if (var5 == 1005) {
            class36.field788 = 2;
            class135.field2351 = 0;
            class8.field125++;
            class203.field3487 = class227.field3891;
            class36.field796 = class58.field1196;
            class223.field3830.method368(22, 166);
            class223.field3830.method348(var4, 4);
        }
        if (var5 == 16) {
            class223.field3830.method368(-98, 93);
            class223.field3830.method344(var2, -904679672);
            class61.field1235++;
            class223.field3830.method344(var4, -904679672);
            class223.field3830.method329(var3, (byte) 97);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 30 && class70.method569(true, var2, var6, var3)) {
            class223.field3830.method368(-112, 100);
            class181.field3174++;
            class223.field3830.method350((byte) 19, class235.field4087 + var2);
            class223.field3830.method337(false, class144.field2606);
            class223.field3830.method344(Integer.MAX_VALUE & (int) (var6 >>> 32), -904679672);
            class223.field3830.method350((byte) 19, class187.field3272);
            class223.field3830.method344(class27.field494 + var3, -904679672);
        }
        if (var5 == 3) {
            class117.method853(118);
        }
        if (var5 == 21) {
            class210 var43 = class232.field4022[var4];
            if (var43 != null) {
                class210.method1406(0, 1, var43.field3743[0], var43.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class135.field2351 = 0;
                class203.field3487 = class227.field3891;
                class36.field796 = class58.field1196;
                class36.field788 = 2;
                class41.field917++;
                class223.field3830.method368(arg1 - 31062, 129);
                class223.field3830.method341(arg1 - 4046, var4);
            }
        }
        if (var5 == 48) {
            class223.field3830.method368(-104, 158);
            class223.field3830.method344(var4, -904679672);
            class210.field3579++;
            class223.field3830.method329(var3, (byte) 97);
            class223.field3830.method350((byte) 19, var2);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 1) {
            class223.field3830.method368(20, 189);
            class26.field476++;
            class223.field3830.method344(var4, -904679672);
            class223.field3830.method341(26994, var2);
            class223.field3830.method337(false, var3);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 57) {
            class169.field2964++;
            class223.field3830.method368(arg1 - 31056, 99);
            class223.field3830.method341(26994, class187.field3272);
            class223.field3830.method350((byte) 19, var2);
            class223.field3830.method337(false, class144.field2606);
            class223.field3830.method350((byte) 19, var4);
            class223.field3830.method329(var3, (byte) 97);
            class14.field235 = 0;
            class263.field4492 = class70.method572(arg1 - 10997, var3);
            class104.field1840 = var2;
        }
        if (var5 == 8) {
            class152.field2693++;
            class223.field3830.method368(arg1 - 31012, 145);
            class223.field3830.method344(var4, -904679672);
            class223.field3830.method344(var2, -904679672);
            class223.field3830.method290((byte) -20, var3);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 1001) {
            class141 var44 = class70.method572(20043, var3);
            if (var44 == null || var44.field2540[var2] < 100000) {
                class22.field404++;
                class223.field3830.method368(-119, 233);
                class223.field3830.method348(var4, 4);
            } else {
                class175.method1212(class238.method1626(new class237[] { class14.method130(var44.field2540[var2], (byte) 117), class167.field2959, class112.method829((byte) -82, var4).field131 }, -39), class239.field4202, (byte) 116, 0);
            }
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 33) {
            class216.field3756++;
            boolean var45 = class210.method1406(0, 0, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 0);
            if (!var45) {
                class210.method1406(0, 1, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
            }
            class203.field3487 = class227.field3891;
            class36.field788 = 2;
            class36.field796 = class58.field1196;
            class135.field2351 = 0;
            class223.field3830.method368(109, 56);
            class223.field3830.method341(26994, class27.field494 + var3);
            class223.field3830.method344(class235.field4087 + var2, arg1 ^ 0xCA13D648);
            class223.field3830.method348(var4, 4);
        }
        if (var5 == 1003) {
            class70.method569(true, var2, var6, var3);
            class56.field1149++;
            class223.field3830.method368(-101, 55);
            class223.field3830.method348((int) (var6 >>> 32) & Integer.MAX_VALUE, arg1 ^ 0x7944);
            class223.field3830.method348(var2 + class235.field4087, 4);
            class223.field3830.method348(var3 + class27.field494, 4);
        }
        if (var5 == 2) {
            class166.field2933++;
            class223.field3830.method368(25, 94);
            class223.field3830.method337(false, var3);
            class223.field3830.method341(arg1 - 4046, var2);
            class223.field3830.method344(var4, -904679672);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 9) {
            class57.field1177++;
            boolean var47 = class210.method1406(0, 0, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 0);
            if (!var47) {
                class210.method1406(0, 1, var3, var2, 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
            }
            class203.field3487 = class227.field3891;
            class36.field796 = class58.field1196;
            class135.field2351 = 0;
            class36.field788 = 2;
            class223.field3830.method368(2, 67);
            class223.field3830.method341(26994, class235.field4087 + var2);
            class223.field3830.method341(arg1 ^ 0x1032, var4);
            class223.field3830.method348(class27.field494 + var3, 4);
        }
        if (var5 == 51) {
            class223.field3830.method368(-102, 52);
            class223.field3830.method344(var4, -904679672);
            class223.field3830.method344(var2, -904679672);
            class101.field1798++;
            class223.field3830.method329(var3, (byte) 97);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 43) {
            class271 var49 = class232.field4025[var4];
            if (var49 != null) {
                class244.field4274++;
                class210.method1406(0, 1, var49.field3743[0], var49.field3715[0], 0, 2, (byte) -56, class229.field3911.field3743[0], 0, class229.field3911.field3715[0], false, 1);
                class203.field3487 = class227.field3891;
                class36.field788 = 2;
                class36.field796 = class58.field1196;
                class135.field2351 = 0;
                class223.field3830.method368(32, 10);
                class223.field3830.method348(var4, arg1 - 31036);
            }
        }
        if (var5 == 20) {
            class69.field1367++;
            class223.field3830.method368(98, 219);
            class223.field3830.method329(var3, (byte) 97);
            class223.field3830.method350((byte) 19, var4);
            class223.field3830.method350((byte) 19, var2);
            class14.field235 = 0;
            class263.field4492 = class70.method572(20043, var3);
            class104.field1840 = var2;
        }
        if (var5 == 58) {
            class70.method569(true, var2, var6, var3);
            class121.field2139++;
            class223.field3830.method368(arg1 ^ 0x7961, 155);
            class223.field3830.method350((byte) 19, class27.field494 + var3);
            class223.field3830.method350((byte) 19, (int) (var6 >>> 32) & Integer.MAX_VALUE);
            class223.field3830.method350((byte) 19, var2 + class235.field4087);
        }
        if (class70.field1376 != 0) {
            class70.field1376 = 0;
            class128.method911(class70.method572(20043, class113.field1977), arg1 - 48189);
        }
        if (class15.field244) {
            class54.method479(0);
        }
        if (class263.field4492 != null && class14.field235 == 0) {
            class128.method911(class263.field4492, arg1 - 48189);
        }
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(II)Z")
    public static final boolean method196(int arg0, int arg1) {
        field369++;
        if (arg0 != -18947) {
            field371 = null;
        }
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class19() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method197(int arg0) {
        field371 = null;
        int var1 = 107 % ((arg0 + 58) / 58);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I[I)[I")
    public static final int[] method198(int arg0, int[] arg1) {
        field370++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class171.method1185(arg1, 0, var2, 0, arg1.length);
            return arg0 < 126 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(III)V")
    private class19(int arg0, int arg1, int arg2) {
    }
}
