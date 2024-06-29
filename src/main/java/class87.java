import java.awt.Graphics;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class87 implements Runnable {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    private int field2200 = 0;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "Z")
    private boolean field2210 = false;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "Z")
    private boolean field2216 = false;

    @OriginalMember(owner = "client!o", name = "H", descriptor = "I")
    private int field2232 = 0;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "Ljava/net/Socket;")
    private Socket field2213;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "Lbd;")
    private class11 field2227;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "Ljava/io/InputStream;")
    private InputStream field2224;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "Ljava/io/OutputStream;")
    private OutputStream field2225;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "Lpd;")
    private static class94 field2211 = class28.method249(19, "as it was used to break our rules)3");

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lpd;")
    public static class94 field2212 = class28.method249(79, "(U2");

    @OriginalMember(owner = "client!o", name = "j", descriptor = "Lpd;")
    private static class94 field2209 = class28.method249(-64, "Login server offline)3");

    @OriginalMember(owner = "client!o", name = "x", descriptor = "Lpd;")
    public static class94 field2223 = field2209;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lpd;")
    private static class94 field2219 = class28.method249(-88, "To create a new account you need to");

    @OriginalMember(owner = "client!o", name = "s", descriptor = "Lpd;")
    public static class94 field2218 = field2211;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "Lpd;")
    public static class94 field2215 = field2219;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field2214 = 0;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "Lpd;")
    public static class94 field2233 = class28.method249(20, "mapdots");

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!o", name = "r", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Ls;")
    public static class111 field2229;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "Ltd;")
    private class118 field2222;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "Lad;")
    public static class5 field2206;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "Lad;")
    public static class5 field2226;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lla;")
    public static class66 field2201;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "Lme;")
    public static class77 field2205;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "[B")
    private byte[] field2220;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V", line = 6)
    public final void method636(int arg0) {
        field2202++;
        if (this.field2210) {
            return;
        }
        synchronized (this) {
            this.field2210 = true;
            this.notifyAll();
            if (arg0 != 1) {
                field2219 = null;
            }
        }
        if (this.field2222 != null) {
            while (this.field2222.field2944 == 0) {
                class127.method1004(1L, -10);
            }
            if (this.field2222.field2944 == 1) {
                try {
                    ((Thread) this.field2222.field2946).join();
                } catch (InterruptedException var3) {
                }
            }
        }
        this.field2222 = null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)I", line = 44)
    public final int method637(int arg0) throws IOException {
        field2230++;
        if (arg0 != 1) {
            field2219 = null;
        }
        return this.field2210 ? 0 : this.field2224.available();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 61)
    public static final void method638(byte arg0) {
        field2231++;
        try {
            Graphics var1 = class128.field3218.getGraphics();
            class8.field235.method498(357, 17, (byte) -12, var1);
        } catch (Exception var3) {
            class128.field3218.repaint();
        }
        int var2 = 115 / ((arg0 - 29) / 53);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([BIII)V", line = 79)
    public final void method639(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2204++;
        if (arg1 != 1885 || this.field2210) {
            return;
        }
        if (this.field2216) {
            this.field2216 = false;
            throw new IOException();
        }
        if (this.field2220 == null) {
            this.field2220 = new byte[5000];
        }
        synchronized (this) {
            for (int var6 = 0; var6 < arg2; var6++) {
                this.field2220[this.field2232] = arg0[arg3 + var6];
                this.field2232 = (this.field2232 + 1) % 5000;
                if ((this.field2200 + 4900) % 5000 == this.field2232) {
                    throw new IOException();
                }
            }
            if (this.field2222 == null) {
                this.field2222 = this.field2227.method74(3, this, (byte) 2);
            }
            this.notifyAll();
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V", line = 133)
    public static void method640(int arg0) {
        field2211 = null;
        field2212 = null;
        field2219 = null;
        field2218 = null;
        field2226 = null;
        field2229 = null;
        field2223 = null;
        field2233 = null;
        field2206 = null;
        field2205 = null;
        field2201 = null;
        if (arg0 < -93) {
            field2215 = null;
            field2209 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/net/Socket;Lbd;)V", line = 622)
    public class87(Socket arg0, class11 arg1) throws IOException {
        this.field2213 = arg0;
        this.field2227 = arg1;
        this.field2213.setSoTimeout(30000);
        this.field2213.setTcpNoDelay(true);
        this.field2224 = this.field2213.getInputStream();
        this.field2225 = this.field2213.getOutputStream();
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)I", line = 185)
    public final int method641(int arg0) throws IOException {
        field2228++;
        if (arg0 == 0) {
            return this.field2210 ? 0 : this.field2224.read();
        } else {
            return -100;
        }
    }

    @OriginalMember(owner = "client!o", name = "finalize", descriptor = "()V", line = 201)
    protected final void finalize() {
        this.method636(1);
        field2208++;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III[B)V", line = 242)
    public final void method642(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2221++;
        if (this.field2210) {
            return;
        }
        while (arg1 > 0) {
            int var5 = this.field2224.read(arg3, arg2, arg1);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg2 += var5;
            arg1 -= var5;
        }
        if (arg0 != -24993) {
            this.field2210 = false;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V", line = 275)
    public static final void method643(int arg0) {
        class76.field1850 = class66.field1612;
        class89.field2321 = class9.field242;
        class17.field446 = class119.field2978;
        class7.field139 = class66.field1618;
        class120.field2998 = class80.field2047;
        class10.field271 = class30.field850;
        class100.field2540 = class102.field2589;
        class70.field1708 = class72.field1757;
        class88.field2245 = class7.field151;
        class19.field510 = class94.field2431;
        class79.field1988 = class121.field3021;
        class95.field2437 = class28.field791;
        class85.field2128 = class134.field3301;
        class54.field1382 = class128.field3216;
        class82.field2092 = class110.field2704;
        class39.field1006 = class19.field507;
        class54.field1379 = class23.field610;
        class8.field228 = class115.field2914;
        class20.field533 = class107.field2661;
        class17.field440 = class128.field3216;
        class62.field1515 = class19.field523;
        class73.field1777 = class40.field1028;
        class101.field2547 = class88.field2267;
        class101.field2546 = class19.field507;
        class30.field859 = class77.field1940;
        class54.field1344 = class20.field556;
        class92.field2358 = class19.field521;
        class134.field3283 = class13.field327;
        class94.field2430 = class79.field2002;
        class54.field1363 = class19.field508;
        class50.field1239 = class110.field2721;
        class127.field3194 = class33.field903;
        class67.field1645 = class31.field888;
        class40.field1034 = class10.field268;
        class54.field1325 = class20.field556;
        class108.field2684 = class50.field1257;
        class17.field411 = class64.field1587;
        class54.field1339 = class88.field2251;
        class99.field2492 = class73.field1788;
        class54.field1332 = class20.field556;
        class64.field1575 = class33.field898;
        class28.field811 = class121.field3031;
        class85.field2135 = class36.field936;
        class92.field2370 = class82.field2083;
        class21.field571 = class64.field1593;
        class46.field1133 = class119.field2969;
        class54.field1328 = class17.field414;
        if (arg0 != -2551) {
            return;
        }
        class102.field2575 = class51.field1282;
        class20.field536 = class69.field1670;
        class86.field2168 = class10.field267;
        class54.field1357 = class23.field598;
        class108.field2678 = class99.field2508;
        class57.field1449 = class36.field950;
        class37.field975 = class82.field2085;
        class21.field589 = class120.field3009;
        class54.field1378 = class89.field2303;
        class136.field3335 = class89.field2320;
        class6.field121 = class136.field3342;
        class80.field2039 = class97.field2477;
        class23.field601 = class123.field3116;
        class50.field1250 = class82.field2097;
        class123.field3120 = class85.field2143;
        class54.field1331 = class29.field835;
        class1.field12 = class115.field2926;
        class7.field148 = class1.field1;
        class70.field1709 = class74.field1820;
        class38.field988 = class123.field3126;
        class27.field743 = class98.field2489;
        class43.field1091 = class52.field1295;
        class50.field1259 = class36.field945;
        class54.field1338 = class20.field556;
        class20.field550 = class19.field511;
        class101.field2552 = class121.field3030;
        class54.field1336 = class20.field556;
        class115.field2924 = class73.field1778;
        class1.field8 = class120.field3004;
        class70.field1701 = class7.field132;
        field2215 = class9.field240;
        class25.field684 = class122.field3050;
        class54.field1375 = class20.field556;
        class100.field2539 = class85.field2145;
        class123.field3129 = class136.field3328;
        class95.field2451 = class134.field3299;
        class121.field3027 = class72.field1750;
        class14.field343 = class66.field1630;
        class119.field2949 = class67.field1636;
        field2218 = class64.field1597;
        class17.field429 = class33.field915;
        class85.field2144 = client.field494;
        class12.field305 = class14.field348;
        class103.field2604 = class62.field1523;
        class29.field836 = class17.field432;
        class57.field1441 = class39.field1013;
        class110.field2757 = class89.field2313;
        class102.field2587 = class69.field1662;
        class54.field1368 = class20.field556;
        class127.field3207 = class36.field949;
        class86.field2166 = class102.field2567;
        class30.field866 = class134.field3292;
        class6.field113 = class94.field2409;
        class89.field2305 = class119.field2967;
        class84.field2124 = class79.field1993;
        class54.field1359 = class25.field692;
        class113.field2878 = class55.field1405;
        class51.field1269 = client.field500;
        class113.field2841 = class94.field2417;
        class17.field435 = class128.field3216;
        class88.field2257 = class40.field1032;
        class54.field1354 = class123.field3118;
        class7.field152 = class45.field1118;
        class111.field2808 = class85.field2129;
        class99.field2515 = class92.field2354;
        class54.field1361 = class97.field2476;
        class54.field1358 = class23.field610;
        class76.field1848 = class77.field1868;
        class81.field2062 = class99.field2493;
        class136.field3334 = class102.field2585;
        class54.field1333 = class20.field556;
        class126.field3156 = class7.field146;
        class63.field1560 = class19.field518;
        class126.field3161 = class135.field3324;
        class54.field1340 = class127.field3183;
        class39.field1012 = class95.field2440;
        class54.field1349 = class20.field556;
        class21.field578 = class30.field871;
        class7.field130 = class41.field1054;
        class66.field1617 = class46.field1123;
        class31.field889 = class105.field2611;
        class108.field2680 = class46.field1137;
        class1.field29 = class20.field547;
        class54.field1351 = class20.field556;
        class108.field2674 = class126.field3171;
        class54.field1348 = class74.field1809;
        class52.field1310 = class29.field837;
        class30.field862 = class112.field2813;
        class14.field336 = class79.field1989;
        class117.field2942 = class33.field921;
        class57.field1448 = class115.field2916;
        class72.field1747 = class12.field308;
        class54.field1330 = class20.field556;
        class64.field1592 = class54.field1371;
        class54.field1377 = class20.field556;
        class119.field2966 = class47.field1146;
        class54.field1372 = class33.field922;
        class28.field806 = class8.field185;
        class74.field1821 = class110.field2754;
        class135.field3320 = class26.field696;
        class105.field2625 = class80.field2046;
        class9.field260 = class46.field1128;
        class97.field2474 = class80.field2052;
        class54.field1356 = class20.field556;
        class7.field154 = class69.field1655;
        class17.field433 = class19.field512;
        class136.field3338 = class29.field840;
        class54.field1376 = class112.field2836;
        class81.field2074 = class111.field2777;
        class88.field2239 = class108.field2685;
        class84.field2125 = class123.field3130;
        class105.field2634 = class136.field3339;
        class17.field434 = class100.field2537;
        class17.field420 = class64.field1587;
        class73.field1783 = class120.field2980;
        class50.field1238 = class57.field1446;
        class2.field69 = class63.field1551;
        class54.field1347 = class29.field835;
        class17.field441 = class128.field3216;
        class120.field3005 = class135.field3311;
        class97.field2467 = class77.field1950;
        class115.field2921 = class80.field2052;
        class38.field991 = class2.field59;
        class54.field1362 = class20.field556;
        class39.field1004 = class136.field3329;
        class27.field748 = class20.field562;
        class126.field3173 = class89.field2304;
        class90.field2333 = class120.field3003;
        class33.field909 = class12.field307;
        class52.field1307 = class112.field2825;
        class37.field973 = class27.field744;
        class54.field1329 = class37.field970;
        class99.field2521 = class33.field916;
        class54.field1345 = class20.field556;
        class21.field579 = class64.field1593;
        class54.field1373 = class136.field3330;
        class92.field2369 = class19.field521;
        class25.field687 = class128.field3215;
        class88.field2255 = class108.field2685;
        class46.field1126 = class33.field899;
        class122.field3085 = class17.field444;
        class120.field3012 = class115.field2908;
        class77.field1881 = class1.field4;
        field2203++;
        class21.field567 = class136.field3333;
        class17.field436 = class100.field2537;
        class63.field1556 = class67.field1639;
        class54.field1353 = class4.field100;
        class112.field2821 = class29.field839;
        class54.field1341 = class20.field556;
        field2223 = class41.field1051;
        class38.field992 = class100.field2531;
        class115.field2910 = class73.field1774;
        class9.field263 = class50.field1263;
        class72.field1724 = class63.field1557;
        class134.field3268 = class86.field2184;
        class50.field1246 = class64.field1591;
        class126.field3175 = class9.field246;
        class28.field804 = class63.field1544;
        class64.field1586 = class84.field2120;
        class72.field1740 = class82.field2094;
        class79.field2012 = class73.field1798;
        class99.field2509 = class46.field1134;
        class115.field2915 = class62.field1522;
        class54.field1366 = class20.field556;
    }

    @OriginalMember(owner = "client!o", name = "run", descriptor = "()V", line = 551)
    public final void run() {
        try {
            while (true) {
                label82: {
                    int var2;
                    int var3;
                    synchronized (this) {
                        if (this.field2232 == this.field2200) {
                            if (this.field2210) {
                                break label82;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var10) {
                            }
                        }
                        if (this.field2200 <= this.field2232) {
                            var2 = this.field2232 - this.field2200;
                        } else {
                            var2 = 5000 - this.field2200;
                        }
                        var3 = this.field2200;
                    }
                    if (var2 <= 0) {
                        continue;
                    }
                    try {
                        this.field2225.write(this.field2220, var3, var2);
                    } catch (IOException var9) {
                        this.field2216 = true;
                    }
                    this.field2200 = (this.field2200 + var2) % 5000;
                    try {
                        if (this.field2232 == this.field2200) {
                            this.field2225.flush();
                        }
                    } catch (IOException var8) {
                        this.field2216 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2224 != null) {
                        this.field2224.close();
                    }
                    if (this.field2225 != null) {
                        this.field2225.close();
                    }
                    if (this.field2213 != null) {
                        this.field2213.close();
                    }
                } catch (IOException var7) {
                }
                this.field2220 = null;
                break;
            }
        } catch (Exception var12) {
            class81.method607(null, var12, (byte) 12);
        }
        field2217++;
    }
}
