import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class383 {
   @OriginalMember(
      owner = "client!client",
      name = "zb",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4361 = new String[]{method2361(method2360("+\u001f<\u0015\u000edA\u000b\u0002\bo\u001eN")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019\"X")), method2361(method2360("hV\u0000\u0006\fx")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019+X")), method2361(method2360("eV\u001a\u0019\u001bn{\u0007\u0012\u001fjE\u0007\u0015\u001e")), method2361(method2360("eV\u0003\u0015")), method2361(method2360("8\u001e")), method2361(method2360(":\u0005G")), method2361(method2360("x@]\u0014Co[\u0002")), method2361(method2360(":\u0003G")), method2361(method2360("w\u0002G")), method2361(method2360("w\u0003G")), method2361(method2360("aV\u0018\u0011CgV\u0000\u0017CyR\b\u001c\bhC@1\u000ehR\u001d\u0003\u0004i[\u000b?\u000faR\r\u0004")), method2361(method2360(":\u0007G")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019-X")), method2361(method2360("w\u0006XY")), method2361(method2360("<\u001e")), method2361(method2360("aV\u0018\u0011CgV\u0000\u0017CH[\u000f\u0003\u001eGX\u000f\u0014\by")), method2361(method2360("3\u001e")), method2361(method2360("P\u0006G")), method2361(method2360("cV\u0000\u0014\u0001n")), method2361(method2360("w\u0006[Y")), method2361(method2360("9\u001e")), method2361(method2360("w\u0001G")), method2361(method2360("2\u001e")), method2361(method2360("h[\u0007\u0015\u0003\u007f")), method2361(method2360(":\u0006G")), method2361(method2360("xR\u001a1\u000ehR\u001d\u0003\u0004i[\u000b")), method2361(method2360(":\u0004G")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019,X")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019)1E")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019)X")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019$X")), method2361(method2360("aD[\u0013\u0002eY\u000b\u0013\u0019TQ\u001b\u001c\u0001")), method2361(method2360("aD[\u0019\u0002")), method2361(method2360("aD[\u0013\u0002eY\u000b\u0013\u0019")), method2361(method2360("aD[\u0013\u0002eY\u000b\u0013\u0019TX\u001b\u0004\u0002mS\u000f\u0004\b")), method2361(method2360("aD[\u0013\u001fh")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019+1E")), method2361(method2360("aD[\u0000\u001fdO\u0017/")), method2361(method2360("7U\u001cNE")), method2361(method2360("7U\u001cN")), method2361(method2360(".\u001e")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u00199X")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019'1E")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019<X")), method2361(method2360("AV\t\u0015\u0015")), method2361(method2360(":\u0005Y^]%\u0007@A")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019$1E")), method2361(method2360("7T\u0001\u001cPmQ\b\u0016\u000bm\t")), method2361(method2360("+\u001aP")), method2361(method2360("EB\u0002\u001c")), method2361(method2360("xD\u0005\u0015\u0014")), method2361(method2360("~D\u000b\u0002+gX\u0019")), method2361(method2360("mE\u0001\u001d\u000fb[\u0002\u0019\u0003l")), method2361(method2360("jS\n\u0019\u0019bX\u0000\u0011\u0001BY\b\u001f")), method2361(method2360("dU\u0004\u0015\u000e\u007fC\u000f\u0017")), method2361(method2360("oR\u0003\u001f\foS\u001c\u0015\u001ex")), method2361(method2360("gX\f\u0012\u0014jS\n\u0002\bxD")), method2361(method2360("gX\f\u0012\u0014bS")), method2361(method2360("oR\u0003\u001f\u0004o")), method2361(method2360("fX\n\u0015\u001acR\u001c\u0015")), method2361(method2360("lV\u0003\u0015")), method2361(method2360("jQ\b\u0019\t")), method2361(method2360("zB\u0007\u0004\u0018y[")), method2361(method2360("jS\u0018\u0015\u001f\u007f")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019\u0007\u001e\u0004\u007f\u001f")), method2361(method2360("hX\u0002\u001f\u0018y^\n")), method2361(method2360("x^\u001a\u0015\u001enC\u001a\u0019\u0003lD1\u001d\bfU\u000b\u0002")), method2361(method2360("xR\u001a\u0004\u0004eP\u001d")), method2361(method2360("gV\u0000\u0017")), method2361(method2360("fX\n\u0015\u001acV\u001a")), method2361(method2360("mX\u001c\u0013\b=\u0003\u0003\u0012")), method2361(method2360("hX\u001b\u001e\u0019yN")), method2361(method2360("~Y\n\u0015\u001f")), method2361(method2360("|X\u001c\u001c\tm[\u000f\u0017\u001e")), method2361(method2360("\u007fE\u001b\u0015")), method2361(method2360("aD")), method2361(method2360("|X\u001c\u001c\tbS")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019/1E")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u00198X")), method2361(method2360("lV\u0003\u0015_")), method2361(method2360("lV\u0003\u0015^")), method2361(method2360("nY\t\u001c\u0004x_")), method2361(method2360("|^\u001e")), method2361(method2360("h[\u0007\u0015\u0003\u007f\u0019\u0003\u0011\u0004e\u001f")), method2361(method2360("yT")), method2361(method2360("JE\t\u0005\u0000nY\u001aP\u000edB\u0000\u0004")), method2361(method2360("g^\u0018\u0015")), method2361(method2360("lR\u001c\u001d\fe")), method2361(method2360("lV\u0003\u0015]")), method2361(method2360("gV\u0000\u0017\u0018jP\u000b")), method2361(method2360("lV\u0003\u0015\\")), method2361(method2360("eB\u0002\u001c")), method2361(method2360("p\u0019@^\u0010"))};
   @OriginalMember(
      owner = "client!client",
      name = "wb",
      descriptor = "I"
   )
   public static int field4343;
   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "I"
   )
   public static int field4344;
   @OriginalMember(
      owner = "client!client",
      name = "lb",
      descriptor = "I"
   )
   public static int field4345;
   @OriginalMember(
      owner = "client!client",
      name = "qb",
      descriptor = "I"
   )
   public static int field4346;
   @OriginalMember(
      owner = "client!client",
      name = "kb",
      descriptor = "I"
   )
   public static int field4347;
   @OriginalMember(
      owner = "client!client",
      name = "ib",
      descriptor = "I"
   )
   public static int field4348;
   @OriginalMember(
      owner = "client!client",
      name = "mb",
      descriptor = "I"
   )
   public static int field4349;
   @OriginalMember(
      owner = "client!client",
      name = "vb",
      descriptor = "I"
   )
   public static int field4350;
   @OriginalMember(
      owner = "client!client",
      name = "ub",
      descriptor = "I"
   )
   public static int field4351;
   @OriginalMember(
      owner = "client!client",
      name = "pb",
      descriptor = "I"
   )
   public static int field4352;
   @OriginalMember(
      owner = "client!client",
      name = "ob",
      descriptor = "I"
   )
   public static int field4353;
   @OriginalMember(
      owner = "client!client",
      name = "tb",
      descriptor = "I"
   )
   public static int field4354;
   @OriginalMember(
      owner = "client!client",
      name = "xb",
      descriptor = "I"
   )
   public static int field4355;
   @OriginalMember(
      owner = "client!client",
      name = "sb",
      descriptor = "I"
   )
   public static int field4356;
   @OriginalMember(
      owner = "client!client",
      name = "yb",
      descriptor = "I"
   )
   public static int field4357;
   @OriginalMember(
      owner = "client!client",
      name = "nb",
      descriptor = "I"
   )
   public static int field4358;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!client",
      name = "jb",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field4359;
   @OriginalMember(
      owner = "client!client",
      name = "rb",
      descriptor = "Z"
   )
   public static boolean field4360;

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(I)V"
   )
   public final void method2335(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method2336(int arg0) {
      boolean var2 = field4360;

      try {
         ++field4352;
         class53.method417(arg0 ^ -9899);
         class693.method5054(69);
         class180.method1438(26274);
         class228.method1778(1);
         class350.method2554((byte)121);
         class660.method4822(23199);
         class282.method2143((byte)-27);
         class26.method259((byte)-82);
         class433.method3199(false);
         class20.method115(false);
         class481.method3497(-13);
         class436.method3218(124);
         class667.method4862(true);
         class76.method691(arg0 + 69);
         class428.method3167(true);
         class478.method3483(51);
         class37.method327(-1);
         class383.method2903((byte)-128);
         class729.method5316((byte)75);
         class412.method3091(-124);
         class521.method3781((byte)-101);
         class66.method501((byte)-30);
         class453.method3311(arg0 + 8009);
         class90.method788(2);
         class339.method2493((byte)-92);
         class57.method440(arg0 ^ -31461);
         class387.method2935(true);
         class110.method892(arg0 ^ 85);
         class399.method3016(arg0 + 22717);
         class750.method5446(114);
         class488.method3539(arg0 + -123);
         class266.method2063((byte)-16);
         class342.method2512(0);
         class80.method722(arg0 ^ -75);
         class140.method1111(104);
         class544.method3911(-1);
         class321.method2382(4);
         class597.method4340((byte)119);
         class138.method1090(26);
         class708.method5153(true);
         class555.method3981((byte)75);
         class786.method5670(-71);
         class635.method4590(-99);
         class220.method1734((byte)-102);
         class304.method2267(96);
         class336.method2474((byte)-127);
         class606.method4410(1367);
         class73.method672((byte)96);
         class327.method2427((byte)-106);
         class255.method1948(arg0 + 30671);
         class474.method3453(64);
         class583.method4254(-125);
         class484.method3511(0);
         class135.method1064((byte)124);
         class725.method5276((byte)-126);
         class529.method3822((byte)-85);
         class338.method2489(true);
         class10.method51((byte)-75);
         class662.method4830(true);
         class117.method938(true);
         class603.method4384(-1);
         class753.method5466((byte)1);
         class291.method2189(3);
         class121.method970(0);
         class446.method3274(arg0 + 75);
         class99.method834(arg0 ^ -108);
         class472.method3435((byte)122);
         class405.method3052(arg0 + 15638);
         class455.method3320(true);
         class147.method1208((byte)98);
         class517.method3763(110);
         class506.method3678(-1);
         class287.method2168(arg0 ^ -49);
         class299.method2233(29325);
         class118.method945(1);
         class594.method4312(293386218);
         class534.method3845(8);
         class3.method13((byte)38);
         class714.method5185(3156);
         class390.method2969(19);
         class133.method1050(false);
         class276.method2102(0);
         class503.method3647((byte)-51);
         class773.method5584(-28862);
         class794.method5721(true);
         class509.method3699(1);
         class278.method2111(-18278);
         class18.method106((byte)74);
         class565.method4027((byte)-108);
         class651.method4771(-21841);
         class192.method1512((byte)119);
         class106.method871(3);
         class85.method759(18295);
         class100.method838((byte)-50);
         class602.method4380(65535);
         class483.method3505((byte)-54);
         class676.method4914(-19702);
         class108.method880(53);
         class70.method650(-42);
         class259.method1987((byte)31);
         class464.method3370(arg0 + -34);
         class580.method4203(125);
         class295.method2221(false);
         class39.method344(0);
         class745.method5395(-1);
         class358.method2672(false);
         class67.method633((byte)108);
         class679.method4953(arg0 ^ 21856);
         class599.method4354(33);
         class489.method3553(-105);
         class742.method5377(1);
         class191.method1507(true);
         class43.method367(96);
         class493.method3580((byte)-105);
         class756.method5488(-51);
         class217.method1715(arg0 + 18540);
         class644.method4659(true);
         class752.method5454(0);
         class97.method826(arg0 ^ 49);
         class130.method1029((byte)65);
         class17.method102(27256);
         class463.method3362((byte)109);
         class146.method1137(false);
         class628.method4557((byte)-92);
         class763.method5537(arg0 ^ 121);
         class183.method1452(8);
         class46.method389(77);
         class128.method1018((byte)-61);
         class84.method748(arg0 + -45);
         class365.method2724((byte)-102);
         class569.method4078(-435);
         class285.method2161(-93);
         class441.method3248((byte)8);
         class668.method4874((byte)18);
         class589.method4285((byte)19);
         class101.method845(-20720);
         class55.method430(false);
         class316.method2320((byte)27);
         class122.method985(1048576);
         class525.method3802(arg0 + 20564);
         class515.method3752(8192);
         class438.method3227((byte)103);
         class206.method1632(arg0 ^ 7592);
         class234.method1808(1);
         class627.method4549(16);
         class731.method5322((byte)99);
         class582.method4212(false);
         class393.method2983(false);
         class245.method1866(3887);
         class200.method1582();
         class536.method3874(122);
         class475.method3457((byte)127);
         class634.method4584(64);
         class645.method4679((byte)67);
         class711.method5169(arg0 ^ 5691);
         class188.method1483(-79);
         class456.method3327(arg0 + 16);
         class685.method5000((byte)90);
         class65.method489((byte)-69);
         class171.method1394(false);
         class187.method1480(true);
         class618.method4488((byte)-128);
         class9.method45(-71);
         class194.method1525((byte)-120);
         class761.method5518(12);
         class759.method5506(true);
         class119.method952(arg0 + -61);
         class467.method3392(0);
         class21.method127((byte)124);
         class129.method1025((byte)-60);
         class650.method4738();
         class749.method5437(arg0 ^ 101);
         class571.method4085((byte)116);
         class374.method2842(2);
         class787.method5681(-8768);
         class237.method1824(arg0 + 28);
         class443.method3255((byte)-113);
         class8.method39(0);
         class169.method1387((byte)-85);
         class788.method5689((byte)126);
         class225.method1759(-95632416);
         class263.method2006((byte)-25);
         class623.method4531(255);
         class62.method472(-92);
         class661.method4827((byte)-103);
         class375.method2850((byte)100);
         class577.method4201();
         class392.method2977((byte)114);
         class223.method1749((byte)83);
         class343.method2519(false);
         class271.method2081(2);
         class751.method5450(0);
         class652.method4780(-120);
         class607.method4421(56);
         class326.method2414(65535);
         class476.method3466();
         class208.method1649(2047);
         class310.method2296(-8266);
         class36.method320(-13);
         class491.method3566(-23925);
         class551.method3956(5);
         class421.method3124(-29833);
         class49.method402(-122);
         class184.method1466(121);
         class290.method2184((byte)111);
         class637.method4607(false);
         class198.method1559(32150);
         class226.method1765((byte)-123);
         class629.method4561(arg0 + 41);
         class688.method5025(32338);
         class300.method2240(arg0 + 4831);
         class772.method5579(true);
         class196.method1537((byte)-128);
         class5.method29();
         class94.method812((byte)85);
         class416.method3113(1);
         class269.method2071(false);
         class736.method5348();
         class13.method74(arg0 + 464);
         class477.method3471(0);
         class686.method5008(-21604);
         class252.method1927((byte)115);
         class111.method902(55);
         class136.method1076((byte)-124);
         class424.method3135(arg0 + -1486);
         class378.method2863(arg0 ^ 58);
         class460.method3351(-31063);
         class332.method2462();
         class754.method5471((byte)-71);
         class115.method927(false);
         class260.method1994(false);
         class193.method1519(125);
         class757.method5498(61);
         class468.method3399(arg0 + 64);
         class681.method4970(arg0 + -48);
         class649.method4731((byte)40);
         class690.method5036((byte)-30);
         class397.method3003((byte)-39);
         class614.method4461((byte)40);
         class298.method2229(7000);
         class457.method3334(false);
         class377.method2854(-124);
         class429.method3172((byte)-120);
         class157.method1318(-110);
         class572.method4090(9);
         class294.method2216(true);
         class330.method2440(-96);
         class647.method4718(true);
         class352.method2569(arg0 ^ 32336);
         class426.method3158((byte)-90);
         class706.method5138(60);
         class308.method2291((byte)108);
         class784.method5645((byte)-64);
         class29.method266((byte)-121);
         class325.method2406((byte)-79);
         class622.method4523(false);
         class244.method1862(arg0 ^ 6);
         class785.method5652((byte)-100);
         class395.method2992(0);
         class356.method2658((byte)-51);
         class621.method4516(19916);
         class11.method61(arg0 + 24854);
         class38.method339(-1);
         class546.method3920(0);
         class617.method4483(arg0 ^ 12);
         class609.method4434(-17888);
         class288.method2179(true);
         class238.method1829(arg0 ^ 48);
         class557.method3997(-103);
         class728.method5309((byte)127);
         class127.method1012(0);
         class318.method2330(22670);
         class636.method4602((byte)-86);
         class655.method4798(arg0 + 27);
         class611.method4441(-1);
         class538.method3877(-17252);
         class626.method4546(0);
         class123.method996(true);
         class199.method1571((byte)-101);
         class273.method2087(-9000);
         class229.method1784((byte)-111);
         class790.method5702(2);
         class317.method2324((byte)108);
         class380.method2871(true);
         class153.method1284(arg0 ^ -49);
         class735.method5345(27785);
         class346.method2533((byte)122);
         class595.method4322(3);
         class508.method3695(true);
         class480.method3494(arg0 + -152);
         class311.method2301(4995);
         class247.method1874(-1);
         class743.method5380(-11333);
         class249.method1922((byte)-119);
         class86.method767(false);
         class22.method133((byte)19);
         class50.method406((byte)59);
         class286.method2164(13189);
         class769.method5566(arg0 ^ 48);
         class592.method4303(false);
         class361.method2705((byte)100);
         class632.method4582();
         class541.method3896(18002);
         class584.method4261(false);
         class781.method5632(46);
         class641.method4635(arg0 + -176);
         class616.method4479(true);
         class25.method234((byte)-95);
         class176.method1417((byte)86);
         class539.method3880((byte)122);
         class552.method3966((byte)-83);
         class713.method5182((byte)90);
         class181.method1441((byte)-30);
         class528.method3819(64);
         class677.method4918(27784);
         class613.method4453((byte)127);
         class643.method4644();
         class158.method1322((byte)40);
         class531.method3828();
         class789.method5700();
         class33.method296(-1);
         class671.method4886();
         class265.method2023(1000000);
         class591.method4299(arg0 + 25210);
         class125.method1003(arg0 ^ 50);
         class264.method2017(-1);
         class351.method2562(true);
         class777.method5599(14);
         class547.method3925(81);
         class739.method5362(0);
         class402.method3035(true);
         class12.method66(-1014);
         class691.method5045((byte)-9);
         class270.method2075((byte)-123);
         class366.method2728(96);
         class445.method3271((byte)112);
         class692.method5048(false);
         class768.method5557(19507);
         class760.method5512(false);
         class359.method2695();
         class535.method3867((byte)-83);
         class382.method2888(-43);
         class624.method4535(119);
         class58.method454((byte)96);
         class333.method2466(true);
         class545.method3915(arg0 + 55);
         class600.method4365((byte)67);
         class409.method3077(-1);
         class102.method849(false);
         class520.method3778(arg0 + 71);
         class103.method855(arg0 ^ 4144);
         class740.method5365(-17006);
         class258.method1967((byte)-123);
         class148.method1226((byte)51);
         class79.method710(arg0 + -170);
         class156.method1308((byte)-50);
         class152.method1272(0);
         class498.method3611(arg0 + -18790);
         class507.method3689(arg0 ^ 127);
         class470.method3410((byte)-30);
         class185.method1474(29209);
         class780.method5615((byte)90);
         class486.method3520((byte)116);
         class601.method4370(3317);
         class588.method4280((byte)63);
         class81.method735(false);
         class747.method5417(81);
         class77.method700((byte)125);
         class212.method1677(false);
         class369.method2756(0);
         class744.method5391((byte)-121);
         class301.method2245(1);
         class716.method5212(0);
         class139.method1101(-126);
         class274.method2093(true);
         class793.method5715(4);
         class615.method4468(5);
         class141.method1116((byte)119);
         class328.method2431(false);
         class656.method4802(79);
         class384.method2910((byte)-111);
         class418.method3119(22935);
         class149.method1237((byte)-2);
         class371.method2832(95);
         class95.method815(-58);
         class427.method3161((byte)120);
         class430.method3181(false);
         class437.method3222(-20205);
         class494.method3587((byte)-78);
         class721.method5243(arg0 ^ 10866);
         class462.method3359();
         class347.method2538(arg0 + -27248);
         class93.method803(arg0 + 1359);
         class407.method3066(true);
         class280.method2135(false);
         class56.method436((byte)-93);
         class132.method1043(14691);
         class178.method1428(false);
         class52.method411((byte)75);
         class434.method3206((byte)-53);
         class314.method2315(true);
         class684.method4987(-1);
         class69.method645((byte)114);
         class246.method1870((byte)117);
         class360.method2700(false);
         class89.method782((byte)-108);
         class2.method5(0);
         class134.method1061(16);
         class189.method1499(0);
         class61.method469(-92);
         class96.method818((byte)-72);
         class581.method4208((byte)73);
         class543.method3904(true);
         class131.method1037(arg0 ^ 49);
         class82.method740((byte)-91);
         class746.method5408(false);
         class98.method830(0);
         class778.method5603(false);
         class510.method3701(-339);
         class414.method3099(111);
         class72.method661((byte)108);
         class758.method5503((byte)-96);
         class406.method3064();
         class452.method3297(-70);
         class701.method5090(-122);
         class695.method5061((byte)120);
         class675.method4902((byte)110);
         if (arg0 != 48) {
            return;
         }

         class215.method1699(65280);
         class738.method5355((byte)-43);
         class23.method145(0);
         class284.method2153(-15725);
         class404.method3044(6408);
         class204.method1614(arg0 + 68);
         class345.method2528(arg0 ^ -105);
         class408.method3070(arg0 ^ -71);
         class719.method5230(-21685);
         class354.method2651(94);
         class14.method83(true);
         class16.method93(true);
         class75.method683((byte)118);
         class116.method934(1);
         class319.method2365(-30809);
         class40.method348(-45);
         class612.method4447(arg0 ^ 28334);
         class631.method4568(73);
         class550.method3951((byte)-106);
         class533.method3837(arg0 + -48);
         class254.method1944((byte)126);
         class64.method486(63);
         class625.method4540(true);
         class666.method4852(true);
         class195.method1532((byte)123);
         class487.method3536(-29729);
         class776.method5595(arg0 ^ 112);
         class182.method1449((byte)-97);
         class558.method4004(arg0 + 212);
         class341.method2501(arg0 ^ -27957);
         class368.method2737(-98);
         class707.method5143(arg0 + 23842);
         class170.method1390(56);
         class373.method2838(3);
         class235.method1812(false);
         class783.method5638(false);
         class663.method4845((byte)-127);
         class403.method3040((byte)85);
         class216.method1705(false);
         class388.method2948((byte)-43);
         class556.method3990(false);
         class590.method4291((byte)-21);
         class689.method5028((byte)117);
         class363.method2714((byte)-116);
         class305.method2273(0);
         class640.method4625(-93);
         class292.method2193((byte)35);
         class88.method776((byte)1);
         class504.method3655(27791);
         class549.method3935((byte)-105);
         class700.method5084(arg0 ^ 102);
         class670.method4883((byte)-66);
         class4.method20((byte)-31);
         class733.method5335(4096);
         class791.method5706(48);
         class267.method2067(-55);
         class31.method280(arg0 ^ 48);
         class458.method3347((byte)-112);
         class564.method4024(512);
         class767.method5552(0);
         class442.method3251(arg0 + 51);
         class211.method1672(-107);
         class566.method4035(59);
         class672.method4889(118);
         class151.method1259((byte)-125);
         class683.method4978(0);
         class401.method3030(14594);
         class450.method3288(arg0 ^ 14);
         class559.method4009((byte)119);
         class155.method1305((byte)-21);
         class423.method3128(85);
         class275.method2096((byte)-120);
         class144.method1128(false);
         class495.method3598(-1);
         class705.method5135(-105);
         class653.method4787(arg0 + 18902);
         class712.method5174((byte)93);
         class60.method463((byte)-44);
         class432.method3190(-102);
         class227.method1769(-127);
         class699.method5080(false);
         class281.method2139(13156520);
         class741.method5372(false);
         class78.method705(arg0 ^ 68);
         class150.method1256(arg0 + 722096096);
         class68.method640((byte)-61);
         class598.method4343((byte)-81);
         class213.method1681(0);
         class657.method4805(-8229);
         class190.method1503((byte)111);
         class792.method5709(arg0 + 524240);
         class497.method3606(28116);
         class630.method4565(true);
         class642.method4639((byte)-118);
         class230.method1792(Integer.MAX_VALUE);
         class161.method1344((byte)26);
         class435.method3212(0);
         class209.method1653((byte)-37);
         class505.method3665(arg0 + 25696);
         class160.method1337(12);
         class179.method1434((byte)-113);
         class782.method5635(-11873);
         class391.method2974(arg0 ^ -89);
         class501.method3640(-102);
         class774.method5590(-123);
         class522.method3791(104);
         class277.method2107(-127);
         class608.method4427(-10001);
         class526.method3806((byte)-78);
         class165.method1367((byte)109);
         class385.method2920(-20359);
         class379.method2866(108);
         class48.method399(-438163134);
         class605.method4403(false);
         class87.method771((byte)-101);
         class490.method3563((byte)88);
         class218.method1721((byte)123);
         class394.method2988(-90);
         class236.method1818(8);
         class722.method5249((byte)-46);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4361[31] + arg0 + ')');
      }

      if (class383.field5550) {
         field4360 = !var2;
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "h",
      descriptor = "(I)Ljava/lang/String;"
   )
   public final String method2337(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "()V"
   )
   public static final void method2338() {
      for(int var0 = 0; var0 < class644.field9403; ++var0) {
         int[] var1 = class318.field4341[var0];

         for(int var2 = 0; var2 < class337.field4594; ++var2) {
            var1[var2] = 0;
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "()V"
   )
   public static final void method2339() {
      int var0 = class390.field5657;
      int[] var1 = class254.field3459;
      int var2 = class679.field10018 ? var0 : class475.field6836 + var0;

      for(int var3 = 0; var3 < var2; ++var3) {
         class279 var4;
         if (var3 < var0) {
            var4 = class380.field5483[var1[var3]];
         } else {
            var4 = ((class529)class328.field4479.method329((byte)-120, (long)class352.field4728[var3 - var0])).field7559;
         }

         if (var4.field3820 >= 0) {
            int var5 = var4.method972(-1);
            if ((var5 & 1) == 0) {
               if ((var4.field10694 & 511) == 0 && (var4.field10693 & 511) == 0) {
                  continue;
               }
            } else if ((var4.field10694 & 511) == 256 && (var4.field10693 & 511) == 256) {
               continue;
            }

            var4.field10697 = class102.method851(var4.field10701, (byte)127, var4.field10694, var4.field10693);
            class430.method3180(var4, true);
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "main",
      descriptor = "([Ljava/lang/String;)V"
   )
   public static final void main(String[] arg0) {
      boolean var1 = field4360;

      try {
         ++field4343;

         try {
            if (arg0.length != 6) {
               class301.method2246(field4361[87], true);
            }

            label95: {
               class393.field5689 = new class431();
               class393.field5689.field6156 = Integer.parseInt(arg0[0]);
               class679.field10017 = new class431();
               class679.field10017.field6156 = Integer.parseInt(arg0[1]);
               class192.field2726 = new class431();
               class192.field2726.field6156 = Integer.parseInt(arg0[2]);
               class290.field4016 = class716.field10409;
               if (!arg0[3].equals(field4361[88])) {
                  if (!arg0[3].equals(field4361[86])) {
                     if (arg0[3].equals(field4361[84])) {
                        class683.field10057 = class446.field6343;
                        if (!var1) {
                           break label95;
                        }
                     }

                     class301.method2246(field4361[71], true);
                     if (!var1) {
                        break label95;
                     }
                  }

                  class683.field10057 = class663.field9652;
                  if (!var1) {
                     break label95;
                  }
               }

               class683.field10057 = class608.field8917;
            }

            class608.field8920 = class373.method2836(arg0[4], (byte)-87);
            if (~class608.field8920 == 0) {
               label103: {
                  if (arg0[4].equals(field4361[83])) {
                     class608.field8920 = 0;
                     if (!var1) {
                        break label103;
                     }
                  }

                  if (arg0[4].equals(field4361[89])) {
                     class608.field8920 = 1;
                     if (!var1) {
                        break label103;
                     }
                  }

                  class301.method2246(field4361[91], true);
               }
            }

            label104: {
               class435.field6231 = false;
               class291.field4025 = false;
               if (arg0[5].equals(field4361[90])) {
                  class134.field1715 = class185.field2620;
                  if (!var1) {
                     break label104;
                  }
               }

               if (!arg0[5].equals(field4361[92])) {
                  if (arg0[5].equals(field4361[81])) {
                     class134.field1715 = class236.field3287;
                     if (!var1) {
                        break label104;
                     }
                  }

                  if (arg0[5].equals(field4361[82])) {
                     class134.field1715 = class184.field2591;
                     if (!var1) {
                        break label104;
                     }
                  }

                  class301.method2246(field4361[62], true);
                  if (!var1) {
                     break label104;
                  }
               }

               class134.field1715 = class152.field2126;
            }

            class238.field3339 = false;
            class564.field8049 = 0;
            class474.field6829 = class134.field1715.field10710;
            class58.field715 = null;
            class779.field11416 = false;
            class612.field8975 = "";
            class4.field31 = 0;
            class741.field10811 = true;
            class379.field5466 = true;
            class314.field4289 = null;
            class428.field6133 = 0L;
            class212.field3032 = 0;
            client var2 = new client();
            class220.field3148 = var2;
            var2.method2894(-26972, 655, false, 1024, class683.field10057.method5315(59) + 32, class134.field1715.field10709, 37, 768);
            class549.field7865.setLocation(40, 40);
         } catch (Exception var5) {
            class668.method4876(-101, (String)null, var5);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4361[85] + (arg0 != null ? field4361[94] : field4361[93]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method2340(boolean arg0) {
      try {
         ++field4357;
         class743.field10831.method334((byte)120);
         if (arg0) {
            method2340(true);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4361[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "h",
      descriptor = "(B)V"
   )
   private final void method2341(byte arg0) {
      boolean var2 = field4360;

      try {
         ++field4349;
         if (class679.field10016 < class667.field9694.field5768) {
            class526.field7533.method3187((byte)-26);
            class213.field3037 = (class667.field9694.field5768 * 50 + -50) * 5;
            if (~class213.field3037 < -3001) {
               class213.field3037 = 3000;
            }

            if (class667.field9694.field5768 >= 2 && ~class667.field9694.field5765 == -7) {
               this.method2901(field4361[36], (byte)-101);
               class622.field9156 = 16;
               return;
            }

            if (class667.field9694.field5768 >= 4 && ~class667.field9694.field5765 == 0) {
               this.method2901(field4361[37], (byte)-93);
               class622.field9156 = 16;
               return;
            }

            if (~class667.field9694.field5768 <= -5 && class507.method3684(arg0 ^ -16366, class622.field9156)) {
               label119: {
                  if (class667.field9694.field5765 != 7 && ~class667.field9694.field5765 != -10) {
                     if (~class667.field9694.field5765 < -1) {
                        if (class690.field10164 != null) {
                           this.method2901(field4361[39] + class690.field10164.trim(), (byte)-101);
                           if (!var2) {
                              break label119;
                           }
                        }

                        this.method2901(field4361[35], (byte)-79);
                        if (!var2) {
                           break label119;
                        }
                     }

                     this.method2901(field4361[34], (byte)-82);
                     if (!var2) {
                        break label119;
                     }
                  }

                  this.method2901(field4361[33], (byte)-125);
               }

               class622.field9156 = 16;
               return;
            }
         }

         if (arg0 == -19) {
            class679.field10016 = class667.field9694.field5768;
            if (~class213.field3037 < -1) {
               --class213.field3037;
            } else {
               try {
                  if (class361.field4925 == 0) {
                     class184.field2590 = class526.field7533.method3185((byte)-121, class316.field4304);
                     ++class361.field4925;
                  }

                  if (class361.field4925 == 1) {
                     if (~class184.field2590.field4078 == -3) {
                        if (class184.field2590.field4077 != null) {
                           class690.field10164 = (String)class184.field2590.field4077;
                        }

                        this.method2356(1000, true);
                        return;
                     }

                     if (~class184.field2590.field4078 == -2) {
                        ++class361.field4925;
                     }
                  }

                  if (~class361.field4925 == -3) {
                     class275.field3769 = new class110((Socket)class184.field2590.field4077, class316.field4304, 25000);
                     class147 var3 = new class147(5);
                     var3.method1186(class555.field7954.field4260, 0);
                     var3.method1160(80, 655);
                     class275.field3769.method891(var3.field1889, 5, 0, -125);
                     ++class361.field4925;
                     class388.field5632 = class133.method1054(arg0 + -29006);
                  }

                  if (~class361.field4925 == -4) {
                     if (!class507.method3684(16383, class622.field9156) && class275.field3769.method888((byte)-49) <= 0) {
                        if (~(class133.method1054(-29025) + -class388.field5632) < -30001L) {
                           this.method2356(1001, true);
                           return;
                        }
                     } else {
                        int var4 = class275.field3769.method897(-101);
                        if (~var4 != -1) {
                           this.method2356(var4, true);
                           return;
                        }

                        ++class361.field4925;
                     }
                  }

                  if (class361.field4925 == 4) {
                     boolean var5 = class507.method3684(arg0 ^ -16366, class622.field9156) || class787.method5675(class622.field9156, arg0 ^ 116) || class426.method3155(true, class622.field9156);
                     class433[] var6 = class433.method3200((byte)-121);
                     class147 var7 = new class147(var6.length * 4);
                     class275.field3769.method895(0, var7.field1889.length, 97, var7.field1889);
                     int var8 = 0;
                     if (var2) {
                        var6[var8].method3198(1, var7.method1164(arg0 ^ -19712));
                        ++var8;
                     }

                     while(true) {
                        while(~var6.length < ~var8) {
                           var6[var8].method3198(1, var7.method1164(arg0 ^ -19712));
                           ++var8;
                        }

                        if (!var2) {
                           class667.field9694.method3021(-47, class275.field3769, !var5);
                           class361.field4925 = 0;
                           class275.field3769 = null;
                           class184.field2590 = null;
                           return;
                        }

                        ++var8;
                     }
                  }
               } catch (IOException var10) {
                  this.method2356(1002, true);
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field4361[38] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method2342(int arg0) {
      try {
         label26: {
            ++field4344;
            if (class300.field4107.field6419.method391(88) != 2) {
               this.method2345((byte)78);
               if (!field4360) {
                  break label26;
               }
            }

            try {
               this.method2345((byte)35);
            } catch (ThreadDeath var5) {
               throw var5;
            } catch (Throwable var6) {
               class668.method4876(-62, var6.getMessage() + field4361[0] + this.method2337(103), var6);
               class380.field5468 = true;
               class42.method358(0, -3, false);
            }
         }

         if (arg0 <= 29) {
            this.method2348(125);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4361[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "g",
      descriptor = "(B)V"
   )
   private final void method2343(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method2344(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!client",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method2345(byte arg0) {
      boolean var2 = field4360;

      try {
         ++field4346;
         if (~class622.field9156 != -17) {
            long var3 = class563.method4019((byte)30) / 1000000L - class111.field1403;
            class111.field1403 = class563.method4019((byte)30) / 1000000L;
            boolean var5 = class117.method939(126);
            if (var5 && class759.field11229 && class218.field3125 != null) {
               class218.field3125.method1554(2000);
            }

            if (class2.method7(class622.field9156, 27382)) {
               label378: {
                  if (class609.field8945 != 0L && class133.method1054(-29025) > class609.field8945) {
                     class331.method2445(false, class173.field2400, class713.method5178(-97), false, class374.field5411);
                     if (!var2) {
                        break label378;
                     }
                  }

                  if (!class383.field5543.method503() && class457.field6570) {
                     class556.method3987((byte)69);
                  }
               }
            }

            if (class326.field4414 == null) {
               Container var6;
               label388: {
                  if (class549.field7865 != null) {
                     var6 = class549.field7865;
                     if (!var2) {
                        break label388;
                     }
                  }

                  if (class216.field3093 != null) {
                     var6 = class216.field3093;
                     if (!var2) {
                        break label388;
                     }
                  }

                  var6 = class362.field4931;
               }

               int var7 = var6.getSize().width;
               int var8 = var6.getSize().height;
               if (class549.field7865 == var6) {
                  Insets var9 = class549.field7865.getInsets();
                  var7 -= var9.right + var9.left;
                  var8 -= var9.top + var9.bottom;
               }

               if (class79.field982 != var7 || ~class689.field10151 != ~var8 || class101.field1292) {
                  label400: {
                     if (class383.field5543 == null || class383.field5543.method526()) {
                        class685.method4994(-124);
                        if (!var2) {
                           break label400;
                        }
                     }

                     class79.field982 = var7;
                     class689.field10151 = var8;
                  }

                  class609.field8945 = class133.method1054(-29025) + 500L;
                  class101.field1292 = false;
               }
            }

            if (arg0 > 24) {
               if (class326.field4414 != null && !class80.field1035 && class2.method7(class622.field9156, 27382)) {
                  class331.method2445(false, -1, class300.field4107.field6443.method2725(108), false, -1);
               }

               boolean var10 = false;
               if (class774.field11367) {
                  class774.field11367 = false;
                  var10 = true;
               }

               if (var10) {
                  class123.method994((byte)-15);
               }

               if (class383.field5543 != null && class383.field5543.method503() || ~class713.method5178(-112) != -2) {
                  class88.method775((byte)48);
               }

               label334: {
                  if (!class507.method3684(16383, class622.field9156)) {
                     if (!class474.method3449((byte)51, class622.field9156)) {
                        if (class636.method4600(-122, class622.field9156)) {
                           class596.method4329((byte)-36);
                           if (!var2) {
                              break label334;
                           }
                        }

                        if (!class709.method5157(class622.field9156, 12)) {
                           if (class622.field9156 != 11) {
                              if (class622.field9156 != 14) {
                                 if (class622.field9156 != 15) {
                                    break label334;
                                 }

                                 class626.method4545(class383.field5543, false, class347.field4690, 2, class180.field2510.method1437(class608.field8920, 50), class427.field6124);
                                 if (!var2) {
                                    break label334;
                                 }
                              }

                              class626.method4545(class383.field5543, false, class347.field4690, 2, class180.field2493.method1437(class608.field8920, 50) + field4361[41] + class180.field2494.method1437(class608.field8920, 50), class427.field6124);
                              if (!var2) {
                                 break label334;
                              }
                           }

                           class345.method2526(111, var3);
                           if (!var2) {
                              break label334;
                           }
                        }

                        if (~class73.field904 != -2) {
                           if (~class73.field904 == -3) {
                              if (class26.field412 > class679.field10000) {
                                 class679.field10000 = class26.field412;
                              }

                              int var11 = 50 - -((-class26.field412 + class679.field10000) * 50 / class679.field10000);
                              class626.method4545(class383.field5543, true, class347.field4690, 2, class180.field2491.method1437(class608.field8920, 50) + field4361[40] + var11 + field4361[42], class427.field6124);
                              if (!var2) {
                                 break label334;
                              }
                           }

                           class626.method4545(class383.field5543, true, class347.field4690, 2, class180.field2491.method1437(class608.field8920, 50), class427.field6124);
                           if (!var2) {
                              break label334;
                           }
                        }

                        if (class287.field3963 < class144.field1834) {
                           class287.field3963 = class144.field1834;
                        }

                        int var12 = (-class144.field1834 + class287.field3963) * 50 / class287.field3963;
                        class626.method4545(class383.field5543, true, class347.field4690, 2, class180.field2491.method1437(class608.field8920, 50) + field4361[40] + var12 + field4361[42], class427.field6124);
                        if (!var2) {
                           break label334;
                        }
                     }

                     class596.method4329((byte)-36);
                     if (!var2) {
                        break label334;
                     }
                  }

                  class652.method4777(var10, true);
               }

               if (class368.field5029 == 3) {
                  int var13 = 0;
                  if (var2 || ~class425.field6085 < ~var13) {
                     do {
                        Rectangle var14 = class763.field11268[var13];
                        if (!class299.field4092[var13]) {
                           if (class301.field4123[var13]) {
                              class383.field5543.method566(var14.y, (byte)-124, var14.x, var14.width, -65536, var14.height);
                              if (!var2) {
                                 ++var13;
                                 continue;
                              }
                           }

                           class383.field5543.method566(var14.y, (byte)-123, var14.x, var14.width, -16711936, var14.height);
                           if (var2) {
                              class383.field5543.method566(var14.y, (byte)-128, var14.x, var14.width, -65281, var14.height);
                              ++var13;
                           } else {
                              ++var13;
                           }
                        } else {
                           class383.field5543.method566(var14.y, (byte)-128, var14.x, var14.width, -65281, var14.height);
                           ++var13;
                        }
                     } while(~class425.field6085 < ~var13);
                  }
               }

               if (class56.method434(1)) {
                  class319.method2363(class383.field5543, 26584);
               }

               label405: {
                  if (!class316.field4304.field9110 || !class2.method7(class622.field9156, 27382) || ~class368.field5029 != -1 || class713.method5178(-23) != 1 || var10) {
                     if (class507.method3684(16383, class622.field9156)) {
                        break label405;
                     }

                     int var15 = 0;
                     if (var2) {
                        class301.field4123[var15] = false;
                        ++var15;
                     }

                     while(true) {
                        while(~class425.field6085 < ~var15) {
                           class301.field4123[var15] = false;
                           ++var15;
                        }

                        try {
                           if (!var2) {
                              if (class681.field10034) {
                                 class517.method3762(0);
                                 if (!var2) {
                                    break label405;
                                 }
                              }

                              class383.field5543.method497(-16);
                              break label405;
                           }
                        } catch (class525 var22) {
                           class668.method4876(-52, var22.getMessage() + field4361[0] + this.method2337(92), var22);
                           class42.method358(0, -3, false);
                           if (!var2) {
                              break label405;
                           }
                           break;
                        }

                        ++var15;
                     }
                  }

                  int var17 = 0;
                  int var18 = 0;
                  if (var2) {
                     if (class301.field4123[var18]) {
                        class301.field4123[var18] = false;
                        class192.field2732[var17++] = class763.field11268[var18];
                     }

                     ++var18;
                  }

                  while(true) {
                     boolean var10000;
                     if (~var18 <= ~class425.field6085) {
                        try {
                           var10000 = class681.field10034;
                           if (!var2) {
                              if (!var10000) {
                                 class383.field5543.method512((byte)126, var17, class192.field2732);
                                 if (!var2) {
                                    break;
                                 }
                              }

                              class662.method4838(var17, -1, class192.field2732);
                              break;
                           }
                        } catch (class525 var21) {
                           break;
                        }
                     } else {
                        var10000 = class301.field4123[var18];
                     }

                     if (var10000) {
                        class301.field4123[var18] = false;
                        class192.field2732[var17++] = class763.field11268[var18];
                     }

                     ++var18;
                  }
               }

               label215: {
                  class26.method257((byte)123);
                  int var19 = class300.field4107.field6445.method2160(-100);
                  if (var19 != 0) {
                     if (var19 != 1) {
                        if (~var19 != -3) {
                           if (~var19 != -4) {
                              break label215;
                           }

                           class661.method4825(0, 2L);
                           if (!var2) {
                              break label215;
                           }
                        }

                        class661.method4825(0, 5L);
                        if (!var2) {
                           break label215;
                        }
                     }

                     class661.method4825(0, 10L);
                     if (!var2) {
                        break label215;
                     }
                  }

                  class661.method4825(0, 15L);
               }

               if (class199.field2834) {
                  class117.method941(-9087);
               }

               if (class300.field4107.field6426.method4877(88) == 1 && ~class622.field9156 == -4 && ~class185.field2623 != 0) {
                  class300.field4107.method3301(25349, class300.field4107.field6426, 0);
                  class441.method3246(0);
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class237.method1823(var23, field4361[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "([Lbl;IIIIIIIIIII)V"
   )
   public static final void method2346(class678[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      label864:
      for(int var12 = 0; var12 < arg0.length; ++var12) {
         class678 var13 = arg0[var12];
         if (var13 != null && var13.field9892 == arg1) {
            int var14 = var13.field9879 + arg6;
            int var15 = var13.field9820 + arg7;
            int var16;
            int var17;
            int var18;
            int var19;
            if (var13.field9992 == 2) {
               var16 = arg2;
               var17 = arg3;
               var18 = arg4;
               var19 = arg5;
            } else {
               int var20 = var13.field9904 + var14;
               int var21 = var13.field9980 + var15;
               if (var13.field9992 == 9) {
                  ++var20;
                  ++var21;
               }

               var16 = var14 > arg2 ? var14 : arg2;
               var17 = var15 > arg3 ? var15 : arg3;
               var18 = var20 < arg4 ? var20 : arg4;
               var19 = var21 < arg5 ? var21 : arg5;
            }

            if (var13.field9992 != 0 && !var13.field9914 && method2351(var13).field3965 == 0 && class368.field5038 != var13 && class720.field10513 != var13.field9865 && class610.field8960 != var13.field9865) {
               if (var16 < var18 && var17 < var19) {
                  class8.method41(var13, -18958);
               }
            } else if (!method2352(var13)) {
               int var22 = 0;
               int var23 = 0;
               if (class681.field10034) {
                  var22 = class85.method755((byte)102);
                  var23 = class592.method4305((byte)127);
               }

               if (class182.field2549 == var13 && class338.method2490(127, class182.field2549) != null) {
                  class218.field3126 = true;
                  class418.field6007 = var14;
                  class605.field8880 = var15;
               }

               if (var13.field9882 || var16 < var18 && var17 < var19) {
                  if (var13.field9947 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     for(class421 var24 = (class421)class460.field6601.method2933(2); var24 != null; var24 = (class421)class460.field6601.method2940(false)) {
                        if (var24.field6011) {
                           var24.method3165(108);
                           var24.field6014.field9987 = false;
                        }
                     }

                     if (class590.field8699 == 0) {
                        class182.field2549 = null;
                        class368.field5038 = null;
                     }

                     class610.field8961 = 0;
                     class538.field7680 = false;
                     class182.field2548 = false;
                     if (!class131.field1677) {
                        class81.method736(0);
                     }
                  }

                  boolean var25;
                  if (class611.field8968.method1660(false) + var22 >= var16 && class611.field8968.method1659((byte)125) + var23 >= var17 && class611.field8968.method1660(false) + var22 < var18 && class611.field8968.method1659((byte)123) + var23 < var19) {
                     var25 = true;
                  } else {
                     var25 = false;
                  }

                  if (!class613.field9015 && var25) {
                     if (var13.field9880 >= 0) {
                        class146.field1843 = var13.field9880;
                     } else if (var13.field9947) {
                        class146.field1843 = -1;
                     }
                  }

                  if (!class131.field1677 && arg10 >= var16 && arg11 >= var17 && arg10 < var18 && arg11 < var19) {
                     class415.method3104(var13, arg10 - var14, arg11 - var15, 123);
                  }

                  boolean var26 = false;
                  if (class611.field8968.method1665((byte)-109) && var25) {
                     var26 = true;
                  }

                  boolean var27 = false;
                  class227 var28 = (class227)class96.field1233.method2933(2);
                  if (var28 != null && var28.method478((byte)116) == 0 && var28.method481((byte)35) + var22 >= var16 && var28.method482((byte)-102) + var23 >= var17 && var28.method481((byte)35) + var22 < var18 && var28.method482((byte)-122) + var23 < var19) {
                     var27 = true;
                  }

                  if (var13.field9960 != null && !class56.method434(1)) {
                     for(int var29 = 0; var29 < var13.field9960.length; ++var29) {
                        if (!class195.field2767.method1779(var13.field9960[var29], -101)) {
                           if (var13.field9816 != null) {
                              var13.field9816[var29] = 0;
                           }
                        } else if (var13.field9816 == null || class96.field1234 >= var13.field9816[var29]) {
                           byte var30 = var13.field9945[var29];
                           if (var30 == 0 || ((var30 & 8) == 0 || !class195.field2767.method1779(86, -101) && !class195.field2767.method1779(82, -101) && !class195.field2767.method1779(81, -101)) && ((var30 & 2) == 0 || class195.field2767.method1779(86, -101)) && ((var30 & 1) == 0 || class195.field2767.method1779(82, -101)) && ((var30 & 4) == 0 || class195.field2767.method1779(81, -101))) {
                              if (var29 < 10) {
                                 class123.method992(var29 + 1, -1, -19390, var13.field9854, "");
                              } else if (var29 == 10) {
                                 class763.method5535(-1);
                                 class287 var31 = method2351(var13);
                                 class675.method4907(var31.method2167((byte)-111), var13, var31.field3969, false);
                                 class198.field2816 = class352.method2567(var13, 2);
                                 if (class198.field2816 == null) {
                                    class198.field2816 = field4361[51];
                                 }

                                 class37.field523 = var13.field9861 + field4361[49];
                              }

                              int var32 = var13.field9926[var29];
                              if (var13.field9816 == null) {
                                 var13.field9816 = new int[var13.field9960.length];
                              }

                              if (var32 != 0) {
                                 var13.field9816[var29] = class96.field1234 + var32;
                              } else {
                                 var13.field9816[var29] = Integer.MAX_VALUE;
                              }
                           }
                        }
                     }
                  }

                  if (var27) {
                     class451.method3291(var23 + var28.method482((byte)-94) - var15, -1, var13, var22 + var28.method481((byte)35) - var14);
                  }

                  if (class182.field2549 != null && class182.field2549 != var13 && var25 && method2351(var13).method2171(1)) {
                     class209.field2976 = var13;
                  }

                  if (class368.field5038 == var13) {
                     class418.field6000 = true;
                     class286.field3958 = var14;
                     class283.field3921 = var15;
                  }

                  if (var13.field9914 || var13.field9865 != 0) {
                     if (var25 && class102.field1311 != 0 && var13.field9870 != null) {
                        class421 var33 = new class421();
                        var33.field6011 = true;
                        var33.field6014 = var13;
                        var33.field6018 = class102.field1311;
                        var33.field6010 = var13.field9870;
                        class460.field6601.method2930((byte)-126, var33);
                     }

                     if (class182.field2549 != null || class131.field1677 || class94.field1223 != var13.field9865 && class610.field8961 > 0) {
                        var27 = false;
                        var26 = false;
                        var25 = false;
                     }

                     if (var13.field9865 != 0) {
                        if (class340.field4621 == var13.field9865 || class477.field6864 == var13.field9865) {
                           class31.field445 = var13;
                           if (class566.field8064 != null) {
                              class566.field8064.method3885(class383.field5543, -25909, var13.field9980);
                           }

                           if (class340.field4621 == var13.field9865) {
                              if (class131.field1677 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                                 continue;
                              }

                              class277.method2106((byte)-97, arg9, arg8, class383.field5543);
                              class706 var34 = (class706)class134.field1712.method5529((byte)-42);

                              while(true) {
                                 if (var34 == null) {
                                    continue label864;
                                 }

                                 if (arg10 >= var34.field10309 && arg10 < var34.field10313 && arg11 >= var34.field10311 && arg11 < var34.field10317) {
                                    class81.method736(0);
                                    class128.method1019(true, var34.field10316);
                                 }

                                 var34 = (class706)class134.field1712.method5527((byte)45);
                              }
                           }
                        }

                        if (class720.field10513 == var13.field9865) {
                           if (var13.method4930(false, class383.field5543) == null || class95.field1226 != 0 && class95.field1226 != 3 || class131.field1677 || arg10 < var16 || arg11 < var17 || arg10 >= var18 || arg11 >= var19) {
                              continue;
                           }

                           int var35 = arg10 - var14;
                           int var36 = arg11 - var15;
                           int var37 = var13.field9825[var36];
                           if (var35 < var37 || var35 > var13.field9845[var36] + var37) {
                              continue;
                           }

                           int var38 = var35 - var13.field9904 / 2;
                           int var39 = var36 - var13.field9980 / 2;
                           int var40;
                           if (class380.field5481 == 4) {
                              var40 = (int)class117.field1467 & 16383;
                           } else {
                              var40 = (int)class117.field1467 + class237.field3298 & 16383;
                           }

                           int var41 = class363.field4956[var40];
                           int var42 = class363.field4987[var40];
                           if (class380.field5481 != 4) {
                              var41 = (class642.field9387 + 256) * var41 >> 8;
                              var42 = (class642.field9387 + 256) * var42 >> 8;
                           }

                           int var43 = var38 * var42 + var39 * var41 >> 14;
                           int var44 = var39 * var42 - var38 * var41 >> 14;
                           int var45;
                           int var46;
                           if (class380.field5481 == 4) {
                              var45 = (class760.field11239 >> 9) + (var43 >> 2);
                              var46 = (class157.field2236 >> 9) - (var44 >> 2);
                           } else {
                              int var47 = (class564.field8045.method972(-1) - 1) * 256;
                              var45 = (class564.field8045.field10694 - var47 >> 9) + (var43 >> 2);
                              var46 = (class564.field8045.field10693 - var47 >> 9) - (var44 >> 2);
                           }

                           if (class613.field9015 && (class375.field5425 & 64) != 0) {
                              class678 var48 = class504.method3657(-108, class573.field8327, class535.field7636);
                              if (var48 != null) {
                                 class655.method4799(class198.field2816, false, field4361[50], true, (long)(var13.field9965 << 0 | var13.field9854), var46, 52, var45, 1L, true, 49, class14.field160, var13.field9912);
                              } else {
                                 class763.method5535(-1);
                              }
                              continue;
                           }

                           if (class152.field2126 == class134.field1715) {
                              class655.method4799(class180.field2506.method1437(class608.field8920, 50), false, "", true, 0L, var46, 25, var45, 1L, true, 11, -1, -1);
                           }

                           class655.method4799(class274.field3763, false, "", true, 0L, var46, 71, var45, 1L, true, 4, class403.field5827, -1);
                           continue;
                        }

                        if (class94.field1223 == var13.field9865) {
                           class521.field7495 = var13;
                           if (var25) {
                              class538.field7680 = true;
                           }

                           if (var27) {
                              int var49 = (int)((double)(var22 + var28.method481((byte)35) - var14 - var13.field9904 / 2) * 2.0D / (double)class650.field9501);
                              int var50 = (int)(-((double)(var23 + var28.method482((byte)-99) - var15 - var13.field9980 / 2) * 2.0D / (double)class650.field9501));
                              int var51 = class220.field3138 + var49 + class650.field9513;
                              int var52 = class224.field3191 + var50 + class650.field9523;
                              class753 var53 = class389.method2956(31140);
                              if (var53 == null) {
                                 continue;
                              }

                              int[] var54 = new int[3];
                              var53.method5464(var54, var52, var51, 0);
                              if (var54 != null) {
                                 if (class195.field2767.method1779(82, -101) && class295.field4073 > 0) {
                                    class229.method1783(var54[1], var54[2], var54[0], true);
                                    continue;
                                 }

                                 class182.field2548 = true;
                                 class649.field9480 = var54[0];
                                 class11.field127 = var54[1];
                                 class52.field670 = var54[2];
                              }

                              class610.field8961 = 1;
                              class704.field10277 = false;
                              class252.field3439 = class611.field8968.method1660(false);
                              class741.field10809 = class611.field8968.method1659((byte)124);
                              continue;
                           }

                           if (var26 && class610.field8961 > 0) {
                              if (class610.field8961 == 1 && (class252.field3439 != class611.field8968.method1660(false) || class741.field10809 != class611.field8968.method1659((byte)12))) {
                                 class192.field2731 = class220.field3138;
                                 class553.field7926 = class224.field3191;
                                 class610.field8961 = 2;
                              }

                              if (class610.field8961 == 2) {
                                 class704.field10277 = true;
                                 class657.method4807(class192.field2731 + (int)((double)(class252.field3439 - class611.field8968.method1660(false)) * 2.0D / (double)class650.field9497), true);
                                 class598.method4344(class553.field7926 - (int)((double)(class741.field10809 - class611.field8968.method1659((byte)125)) * 2.0D / (double)class650.field9497), true);
                              }
                              continue;
                           }

                           if (class610.field8961 > 0 && !class704.field10277) {
                              if ((class501.field7267 == 1 || class787.method5679(2000)) && class278.field3784 > 2) {
                                 class110.method890(class252.field3439, class741.field10809, 0);
                              } else if (class687.method5017(1274)) {
                                 class110.method890(class252.field3439, class741.field10809, 0);
                              }
                           }

                           class610.field8961 = 0;
                           continue;
                        }

                        if (class776.field11383 == var13.field9865) {
                           if (var26) {
                              class616.method4474(-63, var13.field9980, var22 + class611.field8968.method1660(false) - var14, var23 + class611.field8968.method1659((byte)126) - var15, var13.field9904);
                           }
                           continue;
                        }

                        if (class610.field8960 == var13.field9865) {
                           class727.method5301(var14, (byte)7, var15, var13);
                           continue;
                        }
                     }

                     if (!var13.field9953 && var27) {
                        var13.field9953 = true;
                        if (var13.field9888 != null) {
                           class421 var55 = new class421();
                           var55.field6011 = true;
                           var55.field6014 = var13;
                           var55.field6020 = var22 + var28.method481((byte)35) - var14;
                           var55.field6018 = var23 + var28.method482((byte)-118) - var15;
                           var55.field6010 = var13.field9888;
                           class460.field6601.method2930((byte)-67, var55);
                        }
                     }

                     if (var13.field9953 && var26 && var13.field9911 != null) {
                        class421 var56 = new class421();
                        var56.field6011 = true;
                        var56.field6014 = var13;
                        var56.field6020 = var22 + class611.field8968.method1660(false) - var14;
                        var56.field6018 = var23 + class611.field8968.method1659((byte)-86) - var15;
                        var56.field6010 = var13.field9911;
                        class460.field6601.method2930((byte)-81, var56);
                     }

                     if (var13.field9953 && !var26) {
                        var13.field9953 = false;
                        if (var13.field9940 != null) {
                           class421 var57 = new class421();
                           var57.field6011 = true;
                           var57.field6014 = var13;
                           var57.field6020 = var22 + class611.field8968.method1660(false) - var14;
                           var57.field6018 = var23 + class611.field8968.method1659((byte)-101) - var15;
                           var57.field6010 = var13.field9940;
                           class267.field3707.method2930((byte)-50, var57);
                        }
                     }

                     if (var26 && var13.field9937 != null) {
                        class421 var58 = new class421();
                        var58.field6011 = true;
                        var58.field6014 = var13;
                        var58.field6020 = var22 + class611.field8968.method1660(false) - var14;
                        var58.field6018 = var23 + class611.field8968.method1659((byte)123) - var15;
                        var58.field6010 = var13.field9937;
                        class460.field6601.method2930((byte)-44, var58);
                     }

                     if (!var13.field9987 && var25) {
                        var13.field9987 = true;
                        if (var13.field9872 != null) {
                           class421 var59 = new class421();
                           var59.field6011 = true;
                           var59.field6014 = var13;
                           var59.field6020 = var22 + class611.field8968.method1660(false) - var14;
                           var59.field6018 = var23 + class611.field8968.method1659((byte)5) - var15;
                           var59.field6010 = var13.field9872;
                           class460.field6601.method2930((byte)-121, var59);
                        }
                     }

                     if (var13.field9987 && var25 && var13.field9867 != null) {
                        class421 var60 = new class421();
                        var60.field6011 = true;
                        var60.field6014 = var13;
                        var60.field6020 = var22 + class611.field8968.method1660(false) - var14;
                        var60.field6018 = var23 + class611.field8968.method1659((byte)127) - var15;
                        var60.field6010 = var13.field9867;
                        class460.field6601.method2930((byte)-51, var60);
                     }

                     if (var13.field9987 && !var25) {
                        var13.field9987 = false;
                        if (var13.field9909 != null) {
                           class421 var61 = new class421();
                           var61.field6011 = true;
                           var61.field6014 = var13;
                           var61.field6020 = var22 + class611.field8968.method1660(false) - var14;
                           var61.field6018 = var23 + class611.field8968.method1659((byte)127) - var15;
                           var61.field6010 = var13.field9909;
                           class267.field3707.method2930((byte)-108, var61);
                        }
                     }

                     if (var13.field9983 != null) {
                        class421 var62 = new class421();
                        var62.field6014 = var13;
                        var62.field6010 = var13.field9983;
                        class642.field9382.method2930((byte)-91, var62);
                     }

                     if (var13.field9857 != null && class9.field90 > var13.field9941) {
                        if (var13.field9921 != null && class9.field90 - var13.field9941 <= 32) {
                           label751:
                           for(int var63 = var13.field9941; var63 < class9.field90; ++var63) {
                              int var64 = class657.field9606[var63 & 31];

                              for(int var65 = 0; var65 < var13.field9921.length; ++var65) {
                                 if (var13.field9921[var65] == var64) {
                                    class421 var66 = new class421();
                                    var66.field6014 = var13;
                                    var66.field6010 = var13.field9857;
                                    class460.field6601.method2930((byte)-98, var66);
                                    break label751;
                                 }
                              }
                           }
                        } else {
                           class421 var67 = new class421();
                           var67.field6014 = var13;
                           var67.field6010 = var13.field9857;
                           class460.field6601.method2930((byte)-55, var67);
                        }

                        var13.field9941 = class9.field90;
                     }

                     if (var13.field9919 != null && class731.field10691 > var13.field9942) {
                        if (var13.field9844 != null && class731.field10691 - var13.field9942 <= 32) {
                           label727:
                           for(int var68 = var13.field9942; var68 < class731.field10691; ++var68) {
                              int var69 = class20.field228[var68 & 31];

                              for(int var70 = 0; var70 < var13.field9844.length; ++var70) {
                                 if (var13.field9844[var70] == var69) {
                                    class421 var71 = new class421();
                                    var71.field6014 = var13;
                                    var71.field6010 = var13.field9919;
                                    class460.field6601.method2930((byte)-47, var71);
                                    break label727;
                                 }
                              }
                           }
                        } else {
                           class421 var72 = new class421();
                           var72.field6014 = var13;
                           var72.field6010 = var13.field9919;
                           class460.field6601.method2930((byte)-61, var72);
                        }

                        var13.field9942 = class731.field10691;
                     }

                     if (var13.field9907 != null && class427.field6122 > var13.field9833) {
                        if (var13.field9913 != null && class427.field6122 - var13.field9833 <= 32) {
                           label703:
                           for(int var73 = var13.field9833; var73 < class427.field6122; ++var73) {
                              int var74 = class346.field4678[var73 & 31];

                              for(int var75 = 0; var75 < var13.field9913.length; ++var75) {
                                 if (var13.field9913[var75] == var74) {
                                    class421 var76 = new class421();
                                    var76.field6014 = var13;
                                    var76.field6010 = var13.field9907;
                                    class460.field6601.method2930((byte)-67, var76);
                                    break label703;
                                 }
                              }
                           }
                        } else {
                           class421 var77 = new class421();
                           var77.field6014 = var13;
                           var77.field6010 = var13.field9907;
                           class460.field6601.method2930((byte)-51, var77);
                        }

                        var13.field9833 = class427.field6122;
                     }

                     if (var13.field9859 != null && class128.field1640 > var13.field9910) {
                        if (var13.field9973 != null && class128.field1640 - var13.field9910 <= 32) {
                           label679:
                           for(int var78 = var13.field9910; var78 < class128.field1640; ++var78) {
                              int var79 = class489.field7003[var78 & 31];

                              for(int var80 = 0; var80 < var13.field9973.length; ++var80) {
                                 if (var13.field9973[var80] == var79) {
                                    class421 var81 = new class421();
                                    var81.field6014 = var13;
                                    var81.field6010 = var13.field9859;
                                    class460.field6601.method2930((byte)-51, var81);
                                    break label679;
                                 }
                              }
                           }
                        } else {
                           class421 var82 = new class421();
                           var82.field6014 = var13;
                           var82.field6010 = var13.field9859;
                           class460.field6601.method2930((byte)-102, var82);
                        }

                        var13.field9910 = class128.field1640;
                     }

                     if (var13.field9971 != null && class111.field1392 > var13.field9839) {
                        if (var13.field9967 != null && class111.field1392 - var13.field9839 <= 32) {
                           label655:
                           for(int var83 = var13.field9839; var83 < class111.field1392; ++var83) {
                              int var84 = class321.field4386[var83 & 31];

                              for(int var85 = 0; var85 < var13.field9967.length; ++var85) {
                                 if (var13.field9967[var85] == var84) {
                                    class421 var86 = new class421();
                                    var86.field6014 = var13;
                                    var86.field6010 = var13.field9971;
                                    class460.field6601.method2930((byte)-47, var86);
                                    break label655;
                                 }
                              }
                           }
                        } else {
                           class421 var87 = new class421();
                           var87.field6014 = var13;
                           var87.field6010 = var13.field9971;
                           class460.field6601.method2930((byte)-76, var87);
                        }

                        var13.field9839 = class111.field1392;
                     }

                     if (var13.field9856 != null && class224.field3195 > var13.field9827) {
                        if (var13.field9883 != null && class224.field3195 - var13.field9827 <= 32) {
                           label631:
                           for(int var88 = var13.field9827; var88 < class224.field3195; ++var88) {
                              int var89 = class230.field3238[var88 & 31];

                              for(int var90 = 0; var90 < var13.field9883.length; ++var90) {
                                 if (var13.field9883[var90] == var89) {
                                    class421 var91 = new class421();
                                    var91.field6014 = var13;
                                    var91.field6010 = var13.field9856;
                                    class460.field6601.method2930((byte)-123, var91);
                                    break label631;
                                 }
                              }
                           }
                        } else {
                           class421 var92 = new class421();
                           var92.field6014 = var13;
                           var92.field6010 = var13.field9856;
                           class460.field6601.method2930((byte)-63, var92);
                        }

                        var13.field9827 = class224.field3195;
                     }

                     if (class113.field1419 > var13.field9896 && var13.field9920 != null) {
                        class421 var93 = new class421();
                        var93.field6014 = var13;
                        var93.field6010 = var13.field9920;
                        class460.field6601.method2930((byte)-95, var93);
                     }

                     if (class414.field5972 > var13.field9896 && var13.field9841 != null) {
                        class421 var94 = new class421();
                        var94.field6014 = var13;
                        var94.field6010 = var13.field9841;
                        class460.field6601.method2930((byte)-39, var94);
                     }

                     if (class134.field1714 > var13.field9896 && var13.field9881 != null) {
                        class421 var95 = new class421();
                        var95.field6014 = var13;
                        var95.field6010 = var13.field9881;
                        class460.field6601.method2930((byte)-47, var95);
                     }

                     if (class444.field6315 > var13.field9896 && var13.field9958 != null) {
                        class421 var96 = new class421();
                        var96.field6014 = var13;
                        var96.field6010 = var13.field9958;
                        class460.field6601.method2930((byte)-75, var96);
                     }

                     if (class361.field4922 > var13.field9896 && var13.field9826 != null) {
                        class421 var97 = new class421();
                        var97.field6014 = var13;
                        var97.field6010 = var13.field9826;
                        class460.field6601.method2930((byte)-42, var97);
                     }

                     if (class143.field1812 > var13.field9896 && var13.field9836 != null) {
                        class421 var98 = new class421();
                        var98.field6014 = var13;
                        var98.field6010 = var13.field9836;
                        class460.field6601.method2930((byte)-106, var98);
                     }

                     if (class756.field11196 > var13.field9896 && var13.field9927 != null) {
                        class421 var99 = new class421();
                        var99.field6014 = var13;
                        var99.field6010 = var13.field9927;
                        class460.field6601.method2930((byte)-44, var99);
                     }

                     var13.field9896 = class768.field11318;
                     if (var13.field9852 != null) {
                        for(int var100 = 0; var100 < class629.field9234; ++var100) {
                           class421 var101 = new class421();
                           var101.field6014 = var13;
                           var101.field6013 = class88.field1150[var100].method2925(115);
                           var101.field6016 = class88.field1150[var100].method2926(100);
                           var101.field6010 = var13.field9852;
                           class460.field6601.method2930((byte)-86, var101);
                        }
                     }

                     if (class299.field4094 && var13.field9831 != null) {
                        class421 var102 = new class421();
                        var102.field6014 = var13;
                        var102.field6010 = var13.field9831;
                        class460.field6601.method2930((byte)-83, var102);
                     }
                  }

                  if (var13.field9992 == 5 && var13.field9829 != -1) {
                     var13.method4939((byte)124, class685.field10097, class426.field6104).method3885(class383.field5543, -25909, var13.field9980);
                  }

                  class8.method41(var13, -18958);
                  if (var13.field9992 == 0) {
                     method2346(arg0, var13.field9854, var16, var17, var18, var19, var14 - var13.field9864, var15 - var13.field9991, arg8, arg9, arg10, arg11);
                     if (var13.field9840 != null) {
                        method2346(var13.field9840, var13.field9854, var16, var17, var18, var19, var14 - var13.field9864, var15 - var13.field9991, arg8, arg9, arg10, arg11);
                     }

                     class561 var103 = (class561)class191.field2708.method329((byte)-2, (long)var13.field9854);
                     if (var103 != null) {
                        if (class185.field2620 == class134.field1715 && var103.field8020 == 0 && !class131.field1677 && var25 && !class661.field9629) {
                           class81.method736(0);
                        }

                        class667.method4864(var18, arg10, arg8, var103.field8021, (byte)-88, var16, var19, arg11, var15, arg9, var17, var14);
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "(Lbl;)Lbl;"
   )
   public static final class678 method2347(class678 arg0) {
      int var1 = method2351(arg0).method2172((byte)71);
      if (var1 == 0) {
         return null;
      } else {
         for(int var2 = 0; var2 < var1; ++var2) {
            arg0 = class602.method4379((byte)-127, arg0.field9892);
            if (arg0 == null) {
               return null;
            }
         }

         return arg0;
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "d",
      descriptor = "(I)V"
   )
   public final synchronized void method2348(int arg0) {
      try {
         ++field4355;
         if (class216.field3093 != null && class557.field7990 == null && !class316.field4304.field9110) {
            try {
               Class var2 = class216.field3093.getClass();
               Field var3 = var2.getDeclaredField(field4361[2]);
               class557.field7990 = (Canvas)var3.get(class216.field3093);
               var3.set(class216.field3093, (Object)null);
               if (class557.field7990 != null) {
                  return;
               }
            } catch (Exception var5) {
            }
         }

         super.method2348(arg0);
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field4361[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "l",
      descriptor = "(I)V"
   )
   private final void method2349(int arg0) {
      boolean var2 = field4360;

      try {
         ++field4354;
         if (~class622.field9156 != -17) {
            ++class96.field1234;
            if (~(class96.field1234 % 1000) == -2) {
               GregorianCalendar var3 = new GregorianCalendar();
               class682.field10042 = var3.get(11) * 600 - -(10 * var3.get(12)) - -(var3.get(13) / 6);
               class684.field10070.setSeed((long)class682.field10042);
            }

            class430.field6150.method53((byte)-29);
            class430.field6143.method53((byte)-29);
            this.method2353((byte)58);
            if (class488.field6969 != null) {
               class488.field6969.method5610(-4377);
            }

            class423.method3127(0);
            class230.method1790((byte)-88);
            class195.field2767.method1773((byte)13);
            class611.field8968.method1667((byte)-2);
            if (class383.field5543 != null) {
               class383.field5543.method597((int)class133.method1054(-29025));
            }

            class77.method698((byte)116);
            class774.field11368 = 0;
            class629.field9234 = 0;
            class386 var4 = class195.field2767.method1776(-120);
            int var10000;
            class227 var7;
            int var8;
            if (var2) {
               var10000 = var4.method2927(109);
            } else if (var4 == null) {
               var10000 = arg0;
               if (!var2) {
                  if (arg0 <= 39) {
                     return;
                  }

                  class102.field1311 = 0;
                  var7 = class611.field8968.method1661(-753011614);
                  if (var2) {
                     var8 = var7.method478((byte)-110);
                     if (var8 != -1) {
                        if (var8 != 6) {
                           if (class792.method5711(var8, 5510)) {
                              class96.field1233.method2930((byte)-41, var7);
                              if (class96.field1233.method2939((byte)86) > 10) {
                                 class96.field1233.method2941(-14002);
                                 if (var2) {
                                    class102.field1311 += var7.method479((byte)-80);
                                    if (var2) {
                                       class352.field4734.method2930((byte)-87, var7);
                                    }
                                 }
                              }
                           }
                        } else {
                           class102.field1311 += var7.method479((byte)-80);
                           if (var2) {
                              class352.field4734.method2930((byte)-87, var7);
                           }
                        }
                     } else {
                        class352.field4734.method2930((byte)-87, var7);
                     }

                     var7 = class611.field8968.method1661(-753011614);
                  }

                  while(true) {
                     if (var7 == null) {
                        var10000 = class56.method434(1);
                        if (!var2) {
                           if (var10000 != 0) {
                              class600.method4366((byte)6);
                           }

                           label680: {
                              if (!class507.method3684(16383, class622.field9156)) {
                                 if (!class709.method5157(class622.field9156, 12)) {
                                    break label680;
                                 }

                                 class445.method3269(45);
                                 if (!var2) {
                                    break label680;
                                 }
                              }

                              class627.method4550((byte)125);
                              class134.method1060((byte)107);
                           }

                           label808: {
                              if (class787.method5675(class622.field9156, -115) && !class709.method5157(class622.field9156, 12)) {
                                 this.method2343((byte)-128);
                                 class318.method2329(-85);
                                 class214.method1694(-78);
                                 if (!var2) {
                                    break label808;
                                 }
                              }

                              if (class426.method3155(true, class622.field9156) && !class709.method5157(class622.field9156, 12)) {
                                 this.method2343((byte)-125);
                                 class214.method1694(-100);
                                 if (!var2) {
                                    break label808;
                                 }
                              }

                              if (~class622.field9156 != -14) {
                                 if (!class321.method2375(false, class622.field9156) || class709.method5157(class622.field9156, 12)) {
                                    if (class622.field9156 != 14 && class622.field9156 != 15) {
                                       break label808;
                                    }

                                    class214.method1694(-109);
                                    if (class722.field10544 == -3 || ~class722.field10544 == -3 || class722.field10544 == 15) {
                                       break label808;
                                    }

                                    if (~class622.field9156 == -16) {
                                       class127.field1626 = class722.field10544;
                                       class211.field3017 = class517.field7455;
                                       class7.method36(class347.field4693.field6156, 89, class347.field4693.field6161);
                                       class430.field6150.field102 = null;
                                       class731.method5321(14, (byte)-123);
                                       if (!var2) {
                                          break label808;
                                       }
                                    }

                                    class388.method2945(false, (byte)-20);
                                    if (!var2) {
                                       break label808;
                                    }
                                 }

                                 class16.method91((byte)54);
                                 if (!var2) {
                                    break label808;
                                 }
                              }

                              class214.method1694(-126);
                           }

                           class550.method3952(class383.field5543, (byte)-1);
                           class96.field1233.method2941(-14002);
                           return;
                        }
                     } else {
                        var10000 = var7.method478((byte)-110);
                     }

                     var8 = var10000;
                     if (var8 != -1) {
                        if (var8 != 6) {
                           if (class792.method5711(var8, 5510)) {
                              class96.field1233.method2930((byte)-41, var7);
                              if (class96.field1233.method2939((byte)86) > 10) {
                                 class96.field1233.method2941(-14002);
                                 if (var2) {
                                    class102.field1311 += var7.method479((byte)-80);
                                    if (var2) {
                                       class352.field4734.method2930((byte)-87, var7);
                                    }
                                 }
                              }
                           }
                        } else {
                           class102.field1311 += var7.method479((byte)-80);
                           if (var2) {
                              class352.field4734.method2930((byte)-87, var7);
                           }
                        }
                     } else {
                        class352.field4734.method2930((byte)-87, var7);
                     }

                     var7 = class611.field8968.method1661(-753011614);
                  }
               }
            } else {
               var10000 = var4.method2927(109);
            }

            while(true) {
               int var5 = var10000;
               char var6;
               if (~var5 != -3) {
                  if (var5 == 3) {
                     var6 = var4.method2926(108);
                     if (class354.method2645(1)) {
                        if (var6 != '`') {
                           if (var6 != 167) {
                              if (~var6 == -179) {
                                 if (!class56.method434(1)) {
                                    class33.method293(0);
                                    if (var2) {
                                       class75.method686((byte)5);
                                       if (var2) {
                                          if (class629.field9234 < 128) {
                                             class88.field1150[class629.field9234] = var4;
                                             ++class629.field9234;
                                             if (var2 && var5 == 0 && class774.field11368 < 75) {
                                                class628.field9229[class774.field11368] = var4;
                                                ++class774.field11368;
                                             }
                                          }

                                          var4 = class195.field2767.method1776(-45);
                                       } else {
                                          var4 = class195.field2767.method1776(-45);
                                       }
                                    } else {
                                       var4 = class195.field2767.method1776(-45);
                                    }
                                 } else {
                                    class75.method686((byte)5);
                                    if (var2) {
                                       if (class629.field9234 < 128) {
                                          class88.field1150[class629.field9234] = var4;
                                          ++class629.field9234;
                                          if (var2 && var5 == 0 && class774.field11368 < 75) {
                                             class628.field9229[class774.field11368] = var4;
                                             ++class774.field11368;
                                          }
                                       }

                                       var4 = class195.field2767.method1776(-45);
                                    } else {
                                       var4 = class195.field2767.method1776(-45);
                                    }
                                 }
                              } else {
                                 if (class629.field9234 < 128) {
                                    class88.field1150[class629.field9234] = var4;
                                    ++class629.field9234;
                                    if (var2 && var5 == 0 && class774.field11368 < 75) {
                                       class628.field9229[class774.field11368] = var4;
                                       ++class774.field11368;
                                    }
                                 }

                                 var4 = class195.field2767.method1776(-45);
                              }
                           } else if (!class56.method434(1)) {
                              class33.method293(0);
                              if (var2) {
                                 class75.method686((byte)5);
                                 if (var2) {
                                    if (class629.field9234 < 128) {
                                       class88.field1150[class629.field9234] = var4;
                                       ++class629.field9234;
                                       if (var2 && var5 == 0 && class774.field11368 < 75) {
                                          class628.field9229[class774.field11368] = var4;
                                          ++class774.field11368;
                                       }
                                    }

                                    var4 = class195.field2767.method1776(-45);
                                 } else {
                                    var4 = class195.field2767.method1776(-45);
                                 }
                              } else {
                                 var4 = class195.field2767.method1776(-45);
                              }
                           } else {
                              class75.method686((byte)5);
                              if (var2) {
                                 if (class629.field9234 < 128) {
                                    class88.field1150[class629.field9234] = var4;
                                    ++class629.field9234;
                                    if (var2 && var5 == 0 && class774.field11368 < 75) {
                                       class628.field9229[class774.field11368] = var4;
                                       ++class774.field11368;
                                    }
                                 }

                                 var4 = class195.field2767.method1776(-45);
                              } else {
                                 var4 = class195.field2767.method1776(-45);
                              }
                           }
                        } else if (!class56.method434(1)) {
                           class33.method293(0);
                           if (var2) {
                              class75.method686((byte)5);
                              if (var2) {
                                 if (class629.field9234 < 128) {
                                    class88.field1150[class629.field9234] = var4;
                                    ++class629.field9234;
                                    if (var2 && var5 == 0 && class774.field11368 < 75) {
                                       class628.field9229[class774.field11368] = var4;
                                       ++class774.field11368;
                                    }
                                 }

                                 var4 = class195.field2767.method1776(-45);
                              } else {
                                 var4 = class195.field2767.method1776(-45);
                              }
                           } else {
                              var4 = class195.field2767.method1776(-45);
                           }
                        } else {
                           class75.method686((byte)5);
                           if (var2) {
                              if (class629.field9234 < 128) {
                                 class88.field1150[class629.field9234] = var4;
                                 ++class629.field9234;
                                 if (var2 && var5 == 0 && class774.field11368 < 75) {
                                    class628.field9229[class774.field11368] = var4;
                                    ++class774.field11368;
                                 }
                              }

                              var4 = class195.field2767.method1776(-45);
                           } else {
                              var4 = class195.field2767.method1776(-45);
                           }
                        }
                     } else {
                        if (class629.field9234 < 128) {
                           class88.field1150[class629.field9234] = var4;
                           ++class629.field9234;
                           if (var2 && var5 == 0 && class774.field11368 < 75) {
                              class628.field9229[class774.field11368] = var4;
                              ++class774.field11368;
                           }
                        }

                        var4 = class195.field2767.method1776(-45);
                     }
                  } else {
                     if (var5 == 0 && class774.field11368 < 75) {
                        class628.field9229[class774.field11368] = var4;
                        ++class774.field11368;
                     }

                     var4 = class195.field2767.method1776(-45);
                  }
               } else {
                  var6 = var4.method2926(108);
                  if (class354.method2645(1)) {
                     if (var6 != '`') {
                        if (var6 != 167) {
                           if (~var6 == -179) {
                              if (!class56.method434(1)) {
                                 class33.method293(0);
                                 if (var2) {
                                    class75.method686((byte)5);
                                    if (var2) {
                                       if (class629.field9234 < 128) {
                                          class88.field1150[class629.field9234] = var4;
                                          ++class629.field9234;
                                          if (var2 && var5 == 0 && class774.field11368 < 75) {
                                             class628.field9229[class774.field11368] = var4;
                                             ++class774.field11368;
                                          }
                                       }

                                       var4 = class195.field2767.method1776(-45);
                                    } else {
                                       var4 = class195.field2767.method1776(-45);
                                    }
                                 } else {
                                    var4 = class195.field2767.method1776(-45);
                                 }
                              } else {
                                 class75.method686((byte)5);
                                 if (var2) {
                                    if (class629.field9234 < 128) {
                                       class88.field1150[class629.field9234] = var4;
                                       ++class629.field9234;
                                       if (var2 && var5 == 0 && class774.field11368 < 75) {
                                          class628.field9229[class774.field11368] = var4;
                                          ++class774.field11368;
                                       }
                                    }

                                    var4 = class195.field2767.method1776(-45);
                                 } else {
                                    var4 = class195.field2767.method1776(-45);
                                 }
                              }
                           } else {
                              if (class629.field9234 < 128) {
                                 class88.field1150[class629.field9234] = var4;
                                 ++class629.field9234;
                                 if (var2 && var5 == 0 && class774.field11368 < 75) {
                                    class628.field9229[class774.field11368] = var4;
                                    ++class774.field11368;
                                 }
                              }

                              var4 = class195.field2767.method1776(-45);
                           }
                        } else if (!class56.method434(1)) {
                           class33.method293(0);
                           if (var2) {
                              class75.method686((byte)5);
                              if (var2) {
                                 if (class629.field9234 < 128) {
                                    class88.field1150[class629.field9234] = var4;
                                    ++class629.field9234;
                                    if (var2 && var5 == 0 && class774.field11368 < 75) {
                                       class628.field9229[class774.field11368] = var4;
                                       ++class774.field11368;
                                    }
                                 }

                                 var4 = class195.field2767.method1776(-45);
                              } else {
                                 var4 = class195.field2767.method1776(-45);
                              }
                           } else {
                              var4 = class195.field2767.method1776(-45);
                           }
                        } else {
                           class75.method686((byte)5);
                           if (var2) {
                              if (class629.field9234 < 128) {
                                 class88.field1150[class629.field9234] = var4;
                                 ++class629.field9234;
                                 if (var2 && var5 == 0 && class774.field11368 < 75) {
                                    class628.field9229[class774.field11368] = var4;
                                    ++class774.field11368;
                                 }
                              }

                              var4 = class195.field2767.method1776(-45);
                           } else {
                              var4 = class195.field2767.method1776(-45);
                           }
                        }
                     } else if (!class56.method434(1)) {
                        class33.method293(0);
                        if (var2) {
                           class75.method686((byte)5);
                           if (var2) {
                              if (class629.field9234 < 128) {
                                 class88.field1150[class629.field9234] = var4;
                                 ++class629.field9234;
                                 if (var2 && var5 == 0 && class774.field11368 < 75) {
                                    class628.field9229[class774.field11368] = var4;
                                    ++class774.field11368;
                                 }
                              }

                              var4 = class195.field2767.method1776(-45);
                           } else {
                              var4 = class195.field2767.method1776(-45);
                           }
                        } else {
                           var4 = class195.field2767.method1776(-45);
                        }
                     } else {
                        class75.method686((byte)5);
                        if (var2) {
                           if (class629.field9234 < 128) {
                              class88.field1150[class629.field9234] = var4;
                              ++class629.field9234;
                              if (var2 && var5 == 0 && class774.field11368 < 75) {
                                 class628.field9229[class774.field11368] = var4;
                                 ++class774.field11368;
                              }
                           }

                           var4 = class195.field2767.method1776(-45);
                        } else {
                           var4 = class195.field2767.method1776(-45);
                        }
                     }
                  } else {
                     if (class629.field9234 < 128) {
                        class88.field1150[class629.field9234] = var4;
                        ++class629.field9234;
                        if (var2 && var5 == 0 && class774.field11368 < 75) {
                           class628.field9229[class774.field11368] = var4;
                           ++class774.field11368;
                        }
                     }

                     var4 = class195.field2767.method1776(-45);
                  }
               }

               if (var4 == null) {
                  var10000 = arg0;
                  if (!var2) {
                     if (arg0 <= 39) {
                        return;
                     }

                     class102.field1311 = 0;
                     var7 = class611.field8968.method1661(-753011614);
                     if (var2) {
                        var8 = var7.method478((byte)-110);
                        if (var8 != -1) {
                           if (var8 != 6) {
                              if (class792.method5711(var8, 5510)) {
                                 class96.field1233.method2930((byte)-41, var7);
                                 if (class96.field1233.method2939((byte)86) > 10) {
                                    class96.field1233.method2941(-14002);
                                    if (var2) {
                                       class102.field1311 += var7.method479((byte)-80);
                                       if (var2) {
                                          class352.field4734.method2930((byte)-87, var7);
                                       }
                                    }
                                 }
                              }
                           } else {
                              class102.field1311 += var7.method479((byte)-80);
                              if (var2) {
                                 class352.field4734.method2930((byte)-87, var7);
                              }
                           }
                        } else {
                           class352.field4734.method2930((byte)-87, var7);
                        }

                        var7 = class611.field8968.method1661(-753011614);
                     }

                     while(true) {
                        if (var7 == null) {
                           var10000 = class56.method434(1);
                           if (!var2) {
                              if (var10000 != 0) {
                                 class600.method4366((byte)6);
                              }

                              label157: {
                                 if (!class507.method3684(16383, class622.field9156)) {
                                    if (!class709.method5157(class622.field9156, 12)) {
                                       break label157;
                                    }

                                    class445.method3269(45);
                                    if (!var2) {
                                       break label157;
                                    }
                                 }

                                 class627.method4550((byte)125);
                                 class134.method1060((byte)107);
                              }

                              label814: {
                                 if (class787.method5675(class622.field9156, -115) && !class709.method5157(class622.field9156, 12)) {
                                    this.method2343((byte)-128);
                                    class318.method2329(-85);
                                    class214.method1694(-78);
                                    if (!var2) {
                                       break label814;
                                    }
                                 }

                                 if (class426.method3155(true, class622.field9156) && !class709.method5157(class622.field9156, 12)) {
                                    this.method2343((byte)-125);
                                    class214.method1694(-100);
                                    if (!var2) {
                                       break label814;
                                    }
                                 }

                                 if (~class622.field9156 != -14) {
                                    if (!class321.method2375(false, class622.field9156) || class709.method5157(class622.field9156, 12)) {
                                       if (class622.field9156 != 14 && class622.field9156 != 15) {
                                          break label814;
                                       }

                                       class214.method1694(-109);
                                       if (class722.field10544 == -3 || ~class722.field10544 == -3 || class722.field10544 == 15) {
                                          break label814;
                                       }

                                       if (~class622.field9156 == -16) {
                                          class127.field1626 = class722.field10544;
                                          class211.field3017 = class517.field7455;
                                          class7.method36(class347.field4693.field6156, 89, class347.field4693.field6161);
                                          class430.field6150.field102 = null;
                                          class731.method5321(14, (byte)-123);
                                          if (!var2) {
                                             break label814;
                                          }
                                       }

                                       class388.method2945(false, (byte)-20);
                                       if (!var2) {
                                          break label814;
                                       }
                                    }

                                    class16.method91((byte)54);
                                    if (!var2) {
                                       break label814;
                                    }
                                 }

                                 class214.method1694(-126);
                              }

                              class550.method3952(class383.field5543, (byte)-1);
                              class96.field1233.method2941(-14002);
                              return;
                           }
                        } else {
                           var10000 = var7.method478((byte)-110);
                        }

                        var8 = var10000;
                        if (var8 != -1) {
                           if (var8 != 6) {
                              if (class792.method5711(var8, 5510)) {
                                 class96.field1233.method2930((byte)-41, var7);
                                 if (class96.field1233.method2939((byte)86) > 10) {
                                    class96.field1233.method2941(-14002);
                                    if (var2) {
                                       class102.field1311 += var7.method479((byte)-80);
                                       if (var2) {
                                          class352.field4734.method2930((byte)-87, var7);
                                       }
                                    }
                                 }
                              }
                           } else {
                              class102.field1311 += var7.method479((byte)-80);
                              if (var2) {
                                 class352.field4734.method2930((byte)-87, var7);
                              }
                           }
                        } else {
                           class352.field4734.method2930((byte)-87, var7);
                        }

                        var7 = class611.field8968.method1661(-753011614);
                     }
                  }
               } else {
                  var10000 = var4.method2927(109);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field4361[80] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "j",
      descriptor = "(I)V"
   )
   public static final void method2350(int arg0) {
      int var1 = class390.field5657;
      int[] var2 = class254.field3459;

      for(int var3 = 0; var3 < class475.field6836 + var1; ++var3) {
         class279 var4;
         if (var3 < var1) {
            var4 = class380.field5483[var2[var3]];
         } else {
            var4 = ((class529)class328.field4479.method329((byte)-15, (long)class352.field4728[var3 - var1])).field7559;
         }

         if (var4.field10701 == arg0 && var4.field3820 >= 0) {
            int var5 = var4.method972(-1);
            if ((var5 & 1) == 0) {
               if ((var4.field10694 & 511) != 0 || (var4.field10693 & 511) != 0) {
                  continue;
               }
            } else if ((var4.field10694 & 511) != 256 || (var4.field10693 & 511) != 256) {
               continue;
            }

            int var10002;
            if (var5 == 1) {
               int var6 = var4.field10694 >> 9;
               int var7 = var4.field10693 >> 9;
               if (var4.field3820 > class318.field4341[var6][var7]) {
                  class318.field4341[var6][var7] = var4.field3820;
                  class141.field1805[var6][var7] = 1;
               } else if (class318.field4341[var6][var7] == var4.field3820) {
                  var10002 = class141.field1805[var6][var7]++;
               }
            } else {
               int var8 = (var5 - 1) * 256 + 60;
               int var9 = var4.field10694 - var8 >> 9;
               int var10 = var4.field10693 - var8 >> 9;
               int var11 = var4.field10694 + var8 >> 9;
               int var12 = var4.field10693 + var8 >> 9;

               for(int var13 = var9; var13 <= var11; ++var13) {
                  for(int var14 = var10; var14 <= var12; ++var14) {
                     if (var4.field3820 > class318.field4341[var13][var14]) {
                        class318.field4341[var13][var14] = var4.field3820;
                        class141.field1805[var13][var14] = 1;
                     } else if (class318.field4341[var13][var14] == var4.field3820) {
                        var10002 = class141.field1805[var13][var14]++;
                     }
                  }
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "init",
      descriptor = "()V"
   )
   public final void init() {
      boolean var1 = field4360;

      try {
         ++field4348;
         if (this.method2902(false)) {
            label200: {
               class393.field5689 = new class431();
               class393.field5689.field6156 = Integer.parseInt(this.getParameter(field4361[78]));
               class679.field10017 = new class431();
               class679.field10017.field6156 = Integer.parseInt(this.getParameter(field4361[59]));
               class679.field10017.field6161 = this.getParameter(field4361[58]);
               class192.field2726 = new class431();
               class192.field2726.field6156 = Integer.parseInt(this.getParameter(field4361[60]));
               class192.field2726.field6161 = this.getParameter(field4361[57]);
               class290.field4016 = class540.method3891(0, Integer.parseInt(this.getParameter(field4361[61])));
               if (class716.field10409 != class290.field4016) {
                  if (class679.method4963(class290.field4016, (byte)-117) || class435.field6230 == class290.field4016) {
                     break label200;
                  }

                  class290.field4016 = class435.field6230;
                  if (!var1) {
                     break label200;
                  }
               }

               class290.field4016 = class644.field9405;
            }

            class683.field10057 = class132.method1046(1, Integer.parseInt(this.getParameter(field4361[71])));
            if (class683.field10057 != class446.field6343 && class683.field10057 != class663.field9652 && class683.field10057 != class608.field8917) {
               class683.field10057 = class608.field8917;
            }

            try {
               class608.field8920 = Integer.parseInt(this.getParameter(field4361[70]));
            } catch (Exception var17) {
               class608.field8920 = 0;
            }

            label188: {
               String var2 = this.getParameter(field4361[56]);
               if (var2 != null && var2.equals("1")) {
                  class291.field4025 = true;
                  if (!var1) {
                     break label188;
                  }
               }

               class291.field4025 = false;
            }

            label182: {
               String var3 = this.getParameter(field4361[77]);
               if (var3 != null && var3.equals("1")) {
                  class435.field6231 = true;
                  if (!var1) {
                     break label182;
                  }
               }

               class435.field6231 = false;
            }

            label209: {
               String var4 = this.getParameter(field4361[65]);
               if (var4 == null || !var4.equals("1")) {
                  class677.field9803 = false;
                  if (!var1) {
                     break label209;
                  }
               }

               class677.field9803 = true;
            }

            String var5 = this.getParameter(field4361[62]);
            if (var5 != null) {
               label207: {
                  if (var5.equals("0")) {
                     class134.field1715 = class185.field2620;
                     if (!var1) {
                        break label207;
                     }
                  }

                  if (var5.equals("1")) {
                     class134.field1715 = class152.field2126;
                     if (!var1) {
                        break label207;
                     }
                  }

                  if (var5.equals("2")) {
                     class134.field1715 = class236.field3287;
                     if (!var1) {
                        break label207;
                     }
                  }

                  if (var5.equals("3")) {
                     class134.field1715 = class184.field2591;
                  }
               }
            }

            try {
               class564.field8049 = Integer.parseInt(this.getParameter(field4361[63]));
            } catch (Exception var16) {
               class564.field8049 = 0;
            }

            class365.field5006 = this.getParameter(field4361[64]);
            class612.field8975 = this.getParameter(field4361[69]);
            if (class612.field8975 == null) {
               class612.field8975 = "";
            }

            class247.field3408 = "1".equals(this.getParameter(field4361[74]));
            String var6 = this.getParameter(field4361[73]);
            if (var6 != null) {
               try {
                  class4.field31 = Integer.parseInt(var6);
               } catch (Exception var15) {
                  class4.field31 = 0;
               }
            }

            class474.field6829 = Integer.parseInt(this.getParameter(field4361[67]));
            if (~class474.field6829 > -1 || ~class423.field6030.length >= ~class474.field6829) {
               class474.field6829 = 0;
            }

            if (~Integer.parseInt(this.getParameter(field4361[68])) == -2) {
               class741.field10811 = true;
               class379.field5466 = true;
            }

            String var7 = this.getParameter(field4361[54]);
            if (var7 != null && var7.equals(field4361[76])) {
               class238.field3339 = true;
            }

            String var8 = this.getParameter(field4361[52]);
            if (var8 != null) {
               class314.field4289 = class630.method4564(false, class532.method3833(var8, 127));
               if (class314.field4289.length < 16) {
                  class314.field4289 = null;
               }
            }

            String var9 = this.getParameter(field4361[72]);
            if (var9 != null && var9.equals(field4361[76])) {
               class779.field11416 = true;
            }

            String var10 = this.getParameter(field4361[75]);
            if (var10 != null) {
               try {
                  class212.field3032 = Integer.parseInt(var10);
               } catch (Exception var14) {
               }
            }

            String var11 = this.getParameter(field4361[53]);
            if (var11 != null) {
               try {
                  class428.field6133 = Long.parseLong(var11);
               } catch (NumberFormatException var13) {
               }
            }

            class58.field715 = this.getParameter(field4361[55]);
            if (class58.field715 != null && class58.field715.length() > 50) {
               class58.field715 = null;
            }

            label135: {
               if (class185.field2620 == class134.field1715) {
                  class87.field1142 = 765;
                  class60.field743 = 503;
                  if (!var1) {
                     break label135;
                  }
               }

               if (class152.field2126 == class134.field1715) {
                  class87.field1142 = 640;
                  class60.field743 = 480;
               }
            }

            class220.field3148 = this;
            this.method2896((byte)-120, 37, class134.field1715.field10709, 655, 32 - -class683.field10057.method5315(101), class87.field1142, class60.field743);
         }
      } catch (RuntimeException var18) {
         throw class237.method1823(var18, field4361[66] + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Lbl;)Ltja;"
   )
   public static final class287 method2351(class678 arg0) {
      class287 var1 = (class287)class13.field145.method329((byte)105, ((long)arg0.field9854 << 32) + (long)arg0.field9965);
      return var1 != null ? var1 : arg0.field9944;
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "(Lbl;)Z"
   )
   public static final boolean method2352(class678 arg0) {
      if (class661.field9629) {
         if (method2351(arg0).field3965 != 0) {
            return false;
         }

         if (arg0.field9992 == 0) {
            return false;
         }
      }

      return arg0.field9853;
   }

   @OriginalMember(
      owner = "client!client",
      name = "e",
      descriptor = "(B)V"
   )
   private final void method2353(byte arg0) {
      try {
         ++field4345;
         boolean var2 = class667.field9694.method3018((byte)84);
         if (!var2) {
            this.method2341((byte)-19);
         }

         if (arg0 < 11) {
            this.method2353((byte)21);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4361[79] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "c",
      descriptor = "()V"
   )
   public static final void method2354() {
      int var0 = class390.field5657;
      int[] var1 = class254.field3459;
      int var2 = class300.field4107.field6437.method5457(-46);
      boolean var3 = var2 == 1 && var0 > 200 || var2 == 0 && var0 > 50;

      for(int var4 = 0; var4 < var0; ++var4) {
         class121 var14 = class380.field5483[var1[var4]];
         if (!var14.method982(28)) {
            var14.field3820 = -1;
         } else if (var14.field1560) {
            var14.field3820 = -1;
         } else {
            var14.method2117(-128);
            if (var14.field9207 >= 0 && var14.field9208 >= 0 && var14.field9211 < class644.field9403 && var14.field9212 < class337.field4594) {
               var14.field1549 = var14.field3791 ? var3 : false;
               if (class564.field8045 == var14) {
                  var14.field3820 = Integer.MAX_VALUE;
               } else {
                  int var15 = 0;
                  if (!var14.field3801) {
                     ++var15;
                  }

                  if (var14.field3825 > class96.field1234) {
                     var15 += 2;
                  }

                  int var16 = var15 + (5 - var14.method972(-1) << 2);
                  if (!var14.field1535 && !var14.field1555) {
                     if (class80.field1052 == 0) {
                        var16 += 32;
                     } else {
                        var16 += 128;
                     }

                     var16 += 256;
                  } else {
                     var16 += 512;
                  }

                  var14.field3820 = var16 + 1;
               }
            } else {
               var14.field3820 = -1;
            }
         }
      }

      for(int var5 = 0; var5 < class475.field6836; ++var5) {
         class506 var11 = ((class529)class328.field4479.method329((byte)-28, (long)class352.field4728[var5])).field7559;
         if (var11.method3676(-122) && var11.field7333.method5404(126, class21.field248)) {
            var11.method2117(-128);
            if (var11.field9207 >= 0 && var11.field9208 >= 0 && var11.field9211 < class644.field9403 && var11.field9212 < class337.field4594) {
               int var12 = 0;
               if (!var11.field3801) {
                  ++var12;
               }

               if (var11.field3825 > class96.field1234) {
                  var12 += 2;
               }

               int var13 = var12 + (5 - var11.method972(-1) << 2);
               if (class80.field1052 == 0) {
                  if (var11.field7333.field10858) {
                     var13 += 64;
                  } else {
                     var13 += 128;
                  }
               } else if (class80.field1052 == 1) {
                  if (var11.field7333.field10858) {
                     var13 += 32;
                  } else {
                     var13 += 64;
                  }
               }

               if (var11.field7333.field10856) {
                  var13 += 1024;
               } else if (!var11.field7333.field10902) {
                  var13 += 256;
               }

               var11.field3820 = var13 + 1;
            } else {
               var11.field3820 = -1;
            }
         } else {
            var11.field3820 = -1;
         }
      }

      for(int var6 = 0; var6 < class170.field2378.length; ++var6) {
         class339 var7 = class170.field2378[var6];
         if (var7 != null) {
            if (var7.field4608 == 1) {
               class529 var8 = (class529)class328.field4479.method329((byte)-111, (long)var7.field4609);
               if (var8 != null) {
                  class506 var9 = var8.field7559;
                  if (var9.field3820 >= 0) {
                     var9.field3820 += 2048;
                  }
               }
            } else if (var7.field4608 == 10) {
               class121 var10 = class380.field5483[var7.field4609];
               if (var10 != null && class564.field8045 != var10 && var10.field3820 >= 0) {
                  var10.field3820 += 2048;
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "k",
      descriptor = "(I)V"
   )
   public static final void method2355(int arg0) {
      int var1 = class390.field5657;
      int[] var2 = class254.field3459;
      int var3 = class679.field10018 ? var1 : class475.field6836 + var1;

      for(int var4 = 0; var4 < var3; ++var4) {
         class279 var5;
         if (var4 < var1) {
            var5 = class380.field5483[var2[var4]];
         } else {
            var5 = ((class529)class328.field4479.method329((byte)112, (long)class352.field4728[var4 - var1])).field7559;
         }

         if (var5.field10701 == arg0) {
            var5.field3861 = 0;
            if (var5.field3820 < 0) {
               var5.field3801 = false;
            } else {
               int var6 = var5.method972(-1);
               if ((var6 & 1) == 0) {
                  if ((var5.field10694 & 511) != 0 || (var5.field10693 & 511) != 0) {
                     var5.field3801 = false;
                     continue;
                  }
               } else if ((var5.field10694 & 511) != 256 || (var5.field10693 & 511) != 256) {
                  var5.field3801 = false;
                  continue;
               }

               int var10002;
               if (var6 == 1) {
                  int var7 = var5.field10694 >> 9;
                  int var8 = var5.field10693 >> 9;
                  if (class318.field4341[var7][var8] != var5.field3820) {
                     var5.field3801 = true;
                     continue;
                  }

                  if (class141.field1805[var7][var8] > 1) {
                     var10002 = class141.field1805[var7][var8]--;
                     var5.field3801 = true;
                     continue;
                  }
               } else {
                  int var9 = (var6 - 1) * 256 + 252;
                  int var10 = var5.field10694 - var9 >> 9;
                  int var11 = var5.field10693 - var9 >> 9;
                  int var12 = var5.field10694 + var9 >> 9;
                  int var13 = var5.field10693 + var9 >> 9;
                  if (!class169.method1386(var10, var13, var11, var5.field3820, var12, true)) {
                     for(int var14 = var10; var14 <= var12; ++var14) {
                        for(int var15 = var11; var15 <= var13; ++var15) {
                           if (class318.field4341[var14][var15] == var5.field3820) {
                              var10002 = class141.field1805[var14][var15]--;
                           }
                        }
                     }

                     var5.field3801 = true;
                     continue;
                  }
               }

               var5.field3801 = false;
               var5.field10697 = class102.method851(var5.field10701, (byte)127, var5.field10694, var5.field10693);
               class430.method3180(var5, true);
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(IZ)V"
   )
   private final void method2356(int arg0, boolean arg1) {
      try {
         ++field4351;
         if (!arg1) {
            this.method2345((byte)-49);
         }

         class361.field4925 = 0;
         class184.field2590 = null;
         ++class667.field9694.field5768;
         class275.field3769 = null;
         class667.field9694.field5765 = arg0;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field4361[48] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "b",
      descriptor = "()V"
   )
   public static final void method2357() {
      class559.field8015 = 0;

      for(int var0 = 0; var0 < class475.field6836; ++var0) {
         class506 var1 = ((class529)class328.field4479.method329((byte)-60, (long)class352.field4728[var0])).field7559;
         if (var1.field3801 && var1.method967((byte)-30) != -1) {
            int var2 = (var1.method972(-1) - 1) * 256 + 252;
            int var3 = var1.field10694 - var2 >> 9;
            int var4 = var1.field10693 - var2 >> 9;
            class279 var5 = class119.method950((byte)-63, var3, var1.field10701, var4);
            if (var5 != null) {
               int var6 = var5.field3862;
               if (var5 instanceof class506) {
                  var6 += 2048;
               }

               if (var5.field3861 == 0 && var5.method967((byte)96) != -1) {
                  class254.field3462[class559.field8015] = var6;
                  class438.field6260[class559.field8015] = var6;
                  ++class559.field8015;
                  ++var5.field3861;
               }

               class254.field3462[class559.field8015] = var6;
               class438.field6260[class559.field8015] = var1.field3862 + 2048;
               ++class559.field8015;
               ++var5.field3861;
            }
         }
      }

      class426.method3152(0, class438.field6260, class559.field8015 - 1, 1, class254.field3462);
   }

   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method2358(int arg0) {
      try {
         label26: {
            ++field4350;
            if (class300.field4107.field6419.method391(111) == 2) {
               try {
                  this.method2349(63);
                  break label26;
               } catch (ThreadDeath var5) {
                  throw var5;
               } catch (Throwable var6) {
                  class668.method4876(-114, var6.getMessage() + field4361[0] + this.method2337(83), var6);
                  class380.field5468 = true;
                  class42.method358(0, -3, false);
                  if (!field4360) {
                     break label26;
                  }
               }
            }

            this.method2349(86);
         }

         if (arg0 != -6494) {
            method2347((class678)null);
         }
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field4361[32] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!client",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method2359(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2360(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 109);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!client",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2361(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 11;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 110;
            break;
         case 3:
            var10005 = 112;
            break;
         default:
            var10005 = 109;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
