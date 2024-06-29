import jagex3.jagmisc.jagmisc;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class class418 {
   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6009 = new String[]{method3122(method3121("iq4`\u001a")), method3122(method3121("XvyAWxp|W^gz:AZjm}GV+lhVZd#wMVn")), method3122(method3121("YlnCFng:A]em\u007fAFblt\u0002_nwrMVx")), method3122(method3121("ojhGQ\u007fouE[e")), method3122(method3121("HlwR^nw\u007f\f\u0012_luNYbw:L]|9:")), method3122(method3121("[fhD]yn{LQn9:")), method3122(method3121("yftFWyshMTbo\u007f")), method3122(method3121("HbtL]\u007f#mP[\u007ff:V]+")), method3122(method3121("MSI\u0002]me")), method3122(method3121("O0^\u0002FdlvI[\u007f9:\u0002")), method3122(method3121("{quD[gfyRG")), method3122(method3121("dqnJ]+wsNW+psXW6")), method3122(method3121("%ouE")), method3122(method3121("}bhRPbw'")), method3122(method3121("CfsEZ\u007f9:")), method3122(method3121("houQWdvnRG\u007f")), method3122(method3121("nm{@^n#uPFcl:O]of:D[ypn\u0002\u001a~p\u007f\u0002\u0015dqnJ]+?t\u001c\u0015\"")), method3122(method3121("ojiR^jz|RA")), method3122(method3121("|n+")), method3122(method3121("hbyJWxs{AW")), method3122(method3121("OquRBng:A^bftV\u0012hltLWhwsM\\")), method3122(method3121("EbwG\b+")), method3122(method3121("xksDFhosAY")), method3122(method3121("x`hC_io\u007fTSy`i")), method3122(method3121("Iq\u007fCYbm}\u0002\\nt:A]em\u007fAFbltQ\u0012mlh\u0002\u0007+p\u007fA]egi")), method3122(method3121("OquRBng:A^bftV\u0012ap/\u0002\\nw:SGnv\u007f")), method3122(method3121("HbyJWx#hGAnw")), method3122(method3121("NmnG@ng:VY;")), method3122(method3121("fbb@Gbo~C@nb'")), method3122(method3121("AblC\u0012\u007fluNYbw \u0002")), method3122(method3121("hosG\\\u007fghMB")), method3122(method3121("fp")), method3122(method3121("xloLVxwhGSf`uW\\\u007f")), method3122(method3121("iouM_")), method3122(method3121("qluO\u0012")), method3122(method3121("J`nKDn#iV@nbwQ\b+")), method3122(method3121("dp")), method3122(method3121("|n+\u0002TjjvGV")), method3122(method3121("XP_\u0002FdlvI[\u007f9:\u0002")), method3122(method3121("nqhM@\u007ffiV")), method3122(method3121("HvhPWew:V]doqKF+guGAe$n\u0002A~sjM@\u007f#wW^\u007fjjNW+`uPWx")), method3122(method3121("{fhD]yn{LQnw\u007fQF")), method3122(method3121("XksDF&`vKQ`#~KAjavGV%")), method3122(method3121("|9:")), method3122(method3121("lfnAUhluPV")), method3122(method3121("mjvG\u0012johGSoz:GJbpnQ\u0013")), method3122(method3121("lfnJWbdrV")), method3122(method3121("\u007fh*")), method3122(method3121("hpjP]mjvG]~wjWFh")), method3122(method3121("MbsNWo#nM\u0012yf{F\u0012mjvG")), method3122(method3121("evvN")), method3122(method3121("s9")), method3122(method3121("xtsVQctuP^o")), method3122(method3121("jvnMEdqvF")), method3122(method3121("dqnJ]+")), method3122(method3121("{fhO\u0012}bhAA+pyPSfavGV")), method3122(method3121("~mvMSom{V[}fi")), method3122(method3121("jvnMAnwoR")), method3122(method3121("yfiGFfjtK_js")), method3122(method3121("msiMTm")), method3122(method3121("YftFWy#yM@np:L]|9:")), method3122(method3121("MlhAWo#nUWnmsLU+FTcpGF^\u0003")), method3122(method3121("]fhQ[dm \u0002")), method3122(method3121("NmnG@ng:VY>")), method3122(method3121("xblGDjqyQ")), method3122(method3121("B+i\u000b\b+")), method3122(method3121("MSI\u0002]e")), method3122(method3121("xkuUByl|K^bm}\u001f")), method3122(method3121("MbsNWo#nM\u0012nmnG@+wq\u0017")), method3122(method3121("dqnJ]hbwN]hh")), method3122(method3121("dqnJ]\u007fjvGAby\u007f\u0002")), method3122(method3121("OltG")), method3122(method3121("|n(")), method3122(method3121("hpjP]mjvG]~wjWF\u007f")), method3122(method3121("LOB\u0002FdlvI[\u007f9:\u0002")), method3122(method3121("[li\u0018\u0012")), method3122(method3121("MbsNWo#nM\u0012hk{LUn#uPFcl:O]of")), method3122(method3121("hp(FWiv}")), method3122(method3121("}bhR\u000f")), method3122(method3121("cf{RV~nj")), method3122(method3121("MbsNWo#nM\u0012nmnG@+wq\u0010")), method3122(method3121("|n+\u0002A~`yGWof~")), method3122(method3121("MSI\u0018\u0012")), method3122(method3121("IouM_+gsQSio\u007fF")), method3122(method3121("msi\u0002VnaoE\u0012nm{@^ng")), method3122(method3121("\u007fh)")), method3122(method3121("yftFWyfh\u0002\u001f+ShK\\\u007f#}PS{ksAA+q\u007fLVnq\u007fP\u0012bm|M@fbnK]e")), method3122(method3121("D`yNAblt\u0002\\dt:MTm\"")), method3122(method3121("xfhTWyii\u0017Vylj")), method3122(method3121("\u007ft\u007fG\\")), method3122(method3121("NmnG@ng:VY9")), method3122(method3121("hpjP]mjvGQgf{P")), method3122(method3121("lfnASffhCBdp")), method3122(method3121("MlhAWo#nUWnmsLU+gsQSio\u007fF\u001c")), method3122(method3121("\u007fh+")), method3122(method3121("xfn@S")), method3122(method3121("msiM\\")), method3122(method3121("hosRQdnjM\\nmnQ\u000f")), method3122(method3121("yfyVmofxWU6")), method3122(method3121("jvnM\u0012|lhNV+p\u007fNWhw\u007fF")), method3122(method3121("hoi\u0002\u001f+@vGSy#yM\\xlvG")), method3122(method3121("\u007ffbQ[qf")), method3122(method3121("|n(\u0002A~`yGWof~")), method3122(method3121("yfxW[ggjP]mjvG")), method3122(method3121("YfxW[ggsLU+n{R\u0012#tsVZ+shMTbosLU\"")), method3122(method3121("hosRQdnjM\\nmnQ")), method3122(method3121("B+w\u000b\b+")), method3122(method3121("xmvMUbm:")), method3122(method3121("OflKQn9:")), method3122(method3121("hlwOSegi\u0002\u001f+WrKA+`uO_jm~")), method3122(method3121("FfwM@r#{DFnq:A^nbtWB6")), method3122(method3121("yfxW[gg")), method3122(method3121("OquRBng:QWyu\u007fP\u0012ap/\u0002\\nw:SGnv\u007f")), method3122(method3121("dqnJ]qluO\u0012")), method3122(method3121("|1~GP~d")), method3122(method3121("xkuUQdowCB")), method3122(method3121("ebnKDn+Wr`")), method3122(method3121("hlwOSegi")), method3122(method3121("{qsLFmsi")), method3122(method3121("FfwM@r#xGTdq\u007f\u0002Qgf{LG{>")), method3122(method3121("+y ")), method3122(method3121("xziVWfn\u007fO")), method3122(method3121("dqnJ]+`{OWyb:N]hh:KA+")), method3122(method3121("]fh\u0018\u0012")), method3122(method3121("ylnCFn`uL\\n`nOW\u007fkuFA")), method3122(method3121("ffw\u001f")), method3122(method3121("hoi")), method3122(method3121("zbEMBTw\u007fQF6")), method3122(method3121("MbsNWo#nM\u0012nmnG@+wq\u0012")), method3122(method3121("yftFWyfh")), method3122(method3121("D`yNAblt\u0002\\dt:M\\*")), method3122(method3121("GluI\b+")), method3122(method3121("XztVSs9:M@\u007fku\u0002\u000ee=")), method3122(method3121("zbEMBTw\u007fQF")), method3122(method3121("\u007fh/")), method3122(method3121("|n(\u0002TjjvGV")), method3122(method3121("YfxW[ggsLU+n{R")), method3122(method3121("]ftF]y9:")), method3122(method3121("+K\u007fKUcw \u0002")), method3122(method3121("p-4\fO")), method3122(method3121("ojiR^jz|RA+.:v]ldvG\u0012MSI\u0002Seg:MFcfh\u0002[eeuP_jwsM\\")), method3122(method3121("_fbV\u0012hluPVx#yNWjq\u007fF")), method3122(method3121("H9FvWfsFJWjs4FGfs")), method3122(method3121("f`")), method3122(method3121("eltRQx")), method3122(method3121("MbsNWo#nM\u0012nm{@^n#xN]dn")), method3122(method3121("hp(FWiv}\u0018")), method3122(method3121("{fhO\u0012}bhAA+p{TWo")), method3122(method3121("d`yNGof")), method3122(method3121("|n)\u0002A~`yGWof~")), method3122(method3121("dm")), method3122(method3121("MbsNWo#nM\u0012nmnG@+wq\u0011")), method3122(method3121("FA")), method3122(method3121("{`")), method3122(method3121("Cf{R\b+")), method3122(method3121("|jt")), method3122(method3121("hlwRShw")), method3122(method3121("Fa")), method3122(method3121("IouM_+ftCPgf~")), method3122(method3121("yfyVmofxWU")), method3122(method3121("msi\u0002")), method3122(method3121("yvtQQyjjV\u0012")), method3122(method3121("ys")), method3122(method3121("ho\u007fC@\u007ffbV")), method3122(method3121("hlvOS{#sQ\u0012xkuU\\")), method3122(method3121("|n)\u0002TjjvGV")), method3122(method3121("yfiGFhbyJW")), method3122(method3121("hosG\\\u007fii\u0017Vylj")), method3122(method3121("lfnA^bftVDjqj")), method3122(method3121("cj~GQdowCB")), method3122(method3121("FjtK_js:PWxfn")), method3122(method3121("El:QGhk:D[gf")), method3122(method3121("OqsTWy#LG@xjuL\b+")), method3122(method3121("lfnU]yo~")), method3122(method3121("eltRQx>")), method3122(method3121("cf{R")), method3122(method3121("cf{R\u0012&#JP[ew:HS}b:OWflh[\u0012bm|M@fbnK]e")), method3122(method3121("iq\u007fCYhlt")), method3122(method3121("MbsNWo#nM\u0012nmnG@+wq\u0013")), method3122(method3121("cfvR")), method3122(method3121("hp(FWiv}\u0018\u0012#")), method3122(method3121("ebnKDnn\u007fOWyquP")), method3122(method3121("XziVWf#wG_dqc\u0018\u0012")), method3122(method3121("GjxPSyj\u007fQ\u0012~mvMSof~")), method3122(method3121("D+i\u000b\b+")), method3122(method3121("hlvOS{#sQ\u0012cj~FWe")), method3122(method3121("$wwR\u001dcf{R\u001covwR")), method3122(method3121("dqnJ]qluO\u000f")), method3122(method3121("LO:V]doqKF1#:\u0002")), method3122(method3121("BmlC^bg:PWhwEFWiv}\u0002DjooG")), method3122(method3121("\u007fh(")), method3122(method3121("de|")), method3122(method3121("l`")), method3122(method3121("xtsVQcf~")), method3122(method3121("nqhM@ffiQSlf")), method3122(method3121("NmnG@ng:VY:")), method3122(method3121("JqyJ\b+")), method3122(method3121("HloNV+muV\u0012hq\u007fCFn#")), method3122(method3121("XksDF&`vKQ`#_lsIO_f\u0013")), method3122(method3121("BmlC^bg:@Gbo~C@nb:TSgv\u007f")), method3122(method3121("GjxPSyz:W\\gl{F[ed:DSbo\u007fF\u0013")), method3122(method3121("xfnMG\u007fsoV\u0012")), method3122(method3121("msi\u0002VnaoE\u0012ojiCPgf~")), method3122(method3121("lfnA^bftVDjqj@[\u007f")), method3122(method3121("_l}E^ng;")), method3122(method3121("NmnG@ng:VY8")), method3122(method3121("|n)")), method3122(method3121("iq4c\u001a"))};
   @OriginalMember(
      owner = "client!br",
      name = "i",
      descriptor = "[[I"
   )
   public static int[][] field6002 = new int[][]{{12, 12, 12, 12}, {12, 12, 12, 12, 12, 5}, {5, 5, 1, 1}, {5, 1, 1, 5}, {5, 5, 5}, {5, 5, 5}, {12, 12, 12, 12, 12, 12}, {1, 12, 12, 12, 12, 12}, {1, 1, 7, 1}, {8, 9, 9, 8, 8, 3, 1, 9}, {8, 8, 9, 8, 9, 9}, {10, 10, 11, 11, 11, 7, 3, 7}, {12, 12, 12, 12}};
   @OriginalMember(
      owner = "client!br",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field6000 = false;
   @OriginalMember(
      owner = "client!br",
      name = "h",
      descriptor = "Lek;"
   )
   public static class536 field6001 = new class536(6, 8);
   @OriginalMember(
      owner = "client!br",
      name = "d",
      descriptor = "S"
   )
   public static short field6004 = 256;
   @OriginalMember(
      owner = "client!br",
      name = "g",
      descriptor = "[B"
   )
   public static byte[] field6005 = new byte[]{31, -117, 8, 0, 0, 0, 0, 0, 0, 0, -5, 127, -29, -1, 109, 6, 103, 6, 14, 54, 54, 118, 54, 86, 14, 118, 118, 118, 78, 78, 14, 46, 30, 17, 94, 30, 110, 110, 30, 73, 33, 97, 126, 17, 89, 41, 121, 57, 89, 41, 25, 25, 5, 21, 61, 117, 5, 37, 29, 101, 25, 25, 13, 115, 77, 29, 3, 67, 19, 19, 19, 121, 117, 75, 91, 11, 35, 27, 61, 99, 19, 35, -112, 33, -116, -100, -100, -100, 60, -36, 60, 18, -68, -68, 18, 70, -118, 50, -118, 70, 36, -125, -1, 7, 24, 68, 56, 24, 24, 25, 24, 89, 24, -107, 24, -104, 4, 25, -103, 5, 25, 89, -108, 24, -2, 31, 97, -112, 103, 96, 96, 100, 101, 4, 3, 6, 40, 96, 100, 98, 102, 97, 101, 99, -25, -32, -28, -30, 6, 42, -40, 42, -64, -64, -60, -56, -52, -52, -60, -62, -52, -54, -54, -62, 2, -108, -83, 5, -54, 51, -80, 8, -78, 10, 41, 26, 58, -78, 9, 7, 38, -78, 43, 21, -118, 24, 53, 78, 92, -56, -95, -20, -76, -15, -96, 104, -48, -59, 15, 42, -58, 73, 69, 77, -100, 92, 98, -30, 18, -110, 82, -86, 106, -22, 26, -102, 90, 38, -90, 102, -26, 22, -106, 86, -50, 46, -82, 110, -18, 30, -98, 94, -63, 33, -95, 97, -31, 17, -111, 81, -55, 41, -87, 105, -23, 25, -103, 89, -59, 37, -91, 101, -27, 21, -107, 85, -51, 45, -83, 109, -19, 29, -99, 93, -109, 38, 79, -103, 58, 109, -6, -116, -103, -77, 22, 45, 94, -78, 116, -39, -14, 21, 43, 87, 109, -38, -68, 101, -21, -74, -19, 59, 118, -18, 58, 116, -8, -56, -47, 99, -57, 79, -100, 60, 117, -23, -14, -107, -85, -41, -82, -33, -72, 121, -21, -31, -93, -57, 79, -98, 62, 123, -2, -30, -27, -85, -113, -97, 62, 127, -7, -6, -19, -5, -113, -97, -65, 64, -2, 98, 100, 96, 102, -124, 1, -84, -2, 18, 4, -6, -117, -119, -123, -123, -103, -123, 29, -28, 47, 70, -90, 114, -112, 2, 65, 22, 86, 69, 67, 54, 33, -57, 64, -10, -60, 66, 97, 37, -93, 70, 14, 17, -89, -119, 11, 55, 30, -28, 84, 54, 14, -6, 32, -102, 84, 116, -111, 75, 76, -59, -28, -95, -22, 71, -112, -41, -64, 62, 35, -50, 99, 77, 100, -7, 12, -18, 49, -124, -65, 110, 49, -16, -79, 48, 2, -29, 15, -24, 78, 6, 6, 123, -122, -97, -1, -70, 52, 22, -16, -49, 127, -79, -88, -21, -1, 77, 0, 38, 27, -28, 10, 110, 2, 0, 0};
   @OriginalMember(
      owner = "client!br",
      name = "b",
      descriptor = "I"
   )
   public static int field6007 = -1;
   @OriginalMember(
      owner = "client!br",
      name = "e",
      descriptor = "Leg;"
   )
   public static class118 field6008 = new class118(132, 6);
   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "I"
   )
   public static int field6006;
   @OriginalMember(
      owner = "client!br",
      name = "c",
      descriptor = "Lkf;"
   )
   public static class266 field6003;

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(I)V",
      line = 15
   )
   public static void method3119(int arg0) {
      try {
         field6005 = null;
         field6001 = null;
         field6002 = null;
         field6003 = null;
         if (arg0 != 22935) {
            field6004 = 95;
         }

         field6008 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6009[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "a",
      descriptor = "(ZIZLjava/lang/String;)V",
      line = 29
   )
   public static final void method3120(boolean arg0, int arg1, boolean arg2, String arg3) {
      boolean var4 = client.field4360;

      try {
         ++field6006;

         try {
            if (arg3.equalsIgnoreCase(field6009[117]) || arg3.equalsIgnoreCase(field6009[179])) {
               class756.method5492((byte)106, field6009[109]);
               class756.method5492((byte)106, field6009[100]);
               class756.method5492((byte)106, field6009[140]);
               class756.method5492((byte)106, field6009[86]);
               class756.method5492((byte)106, field6009[176]);
               return;
            }

            if (arg3.equalsIgnoreCase(field6009[126])) {
               class141.field1799 = 0;
               class234.field3265 = 0;
               return;
            }

            if (arg3.equalsIgnoreCase(field6009[17])) {
               class753.field11135 = !class753.field11135;
               if (class753.field11135) {
                  class756.method5492((byte)106, field6009[66]);
                  return;
               }

               class756.method5492((byte)106, field6009[8]);
               return;
            }

            if (arg1 != 0) {
               return;
            }

            if (arg3.equals(field6009[129])) {
               class122 var5 = class383.field5543.method573();
               class756.method5492((byte)106, field6009[137] + var5.field1584);
               class756.method5492((byte)106, field6009[21] + var5.field1582);
               class756.method5492((byte)106, field6009[62] + var5.field1583);
               class756.method5492((byte)106, field6009[108] + var5.field1586);
               class756.method5492((byte)106, field6009[172] + var5.field1577);
               return;
            }

            if (arg3.equals(field6009[175])) {
               class756.method5492((byte)106, field6009[154] + class409.field5915 + field6009[152]);
               return;
            }
         } catch (Exception var55) {
            class756.method5492((byte)106, class180.field2481.method1437(class608.field8920, 50));
            return;
         }

         if (class435.field6230 != class290.field4016 || class295.field4073 >= 2) {
            if (arg3.equalsIgnoreCase(field6009[39])) {
               throw new RuntimeException();
            }

            if (arg3.equals(field6009[181])) {
               throw new OutOfMemoryError(field6009[116]);
            }

            try {
               label787: {
                  if (arg3.equalsIgnoreCase(field6009[118])) {
                     class756.method5492((byte)106, field6009[82] + class108.field1348);
                     return;
                  }

                  if (arg3.equalsIgnoreCase(field6009[148])) {
                     class696.field10207 = !class696.field10207;
                     if (!class696.field10207) {
                        class756.method5492((byte)106, field6009[87]);
                        return;
                     }

                     class756.method5492((byte)106, field6009[130]);
                     return;
                  }

                  if (arg3.equalsIgnoreCase(field6009[96])) {
                     class753.field11135 = true;
                     class756.method5492((byte)106, field6009[84]);
                     return;
                  }

                  if (arg3.equalsIgnoreCase(field6009[59])) {
                     class753.field11135 = false;
                     class756.method5492((byte)106, field6009[202]);
                     return;
                  }

                  if (arg3.equals(field6009[121])) {
                     try {
                        class756.method5492((byte)106, field6009[182] + jagmisc.getAvailablePhysicalMemory() / 1048576L + "/" + class169.field2360.field1162 + field6009[157]);
                        return;
                     } catch (Throwable var49) {
                        return;
                     }
                  }

                  if (arg3.equalsIgnoreCase(field6009[163])) {
                     class477.field6863.method5525(6798);
                     class756.method5492((byte)106, field6009[141]);
                     return;
                  }

                  if (!arg3.equalsIgnoreCase(field6009[192])) {
                     if (arg3.equalsIgnoreCase(field6009[156])) {
                        class276.method2100(0);
                        int var9 = 0;
                        if (var4) {
                           System.gc();
                           ++var9;
                        }

                        while(true) {
                           if (~var9 <= -11) {
                              Runtime var10 = Runtime.getRuntime();
                              int var11 = (int)((var10.totalMemory() - var10.freeMemory()) / 1024L);
                              class756.method5492((byte)106, field6009[119] + var11 + "k");
                              class483.method3504((byte)-114);
                              class276.method2100(0);
                              int var12 = 0;
                              if (!var4) {
                                 if (var4) {
                                    System.gc();
                                    ++var12;
                                 }

                                 while(true) {
                                    if (var12 >= 10) {
                                       int var13 = (int)((var10.totalMemory() - var10.freeMemory()) / 1024L);
                                       class756.method5492((byte)106, field6009[110] + var13 + "k");
                                       if (!var4) {
                                          return;
                                       }
                                    } else {
                                       System.gc();
                                    }

                                    ++var12;
                                 }
                              }
                           } else {
                              System.gc();
                           }

                           ++var9;
                        }
                     }

                     if (arg3.equalsIgnoreCase(field6009[56])) {
                        class756.method5492((byte)106, class521.method3782(false) ? field6009[183] : field6009[200]);
                        return;
                     }

                     if (arg3.equalsIgnoreCase(field6009[30])) {
                        class756.method5492((byte)106, field6009[20]);
                        if (class622.field9156 != 11) {
                           if (class622.field9156 == 12) {
                              class430.field6150.field119 = true;
                              return;
                           }
                        } else {
                           class644.method4661(-103);
                        }

                        return;
                     }

                     if (arg3.equalsIgnoreCase(field6009[124])) {
                        class526.field7533.method3187((byte)-26);
                        class756.method5492((byte)106, field6009[2]);
                        return;
                     }

                     if (arg3.equalsIgnoreCase(field6009[167])) {
                        class667.field9694.method3009(arg1 ^ 75);
                        class756.method5492((byte)106, field6009[25]);
                        return;
                     }

                     if (arg3.equalsIgnoreCase(field6009[88])) {
                        class667.field9694.method3012(0);
                        class756.method5492((byte)106, field6009[112]);
                        return;
                     }

                     if (!arg3.equalsIgnoreCase(field6009[177])) {
                        if (arg3.equalsIgnoreCase(field6009[111])) {
                           class606.method4412(-9114);
                           class188.method1492(-1);
                           class756.method5492((byte)106, field6009[136]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[103])) {
                           class637.field9319 = class133.method1054(-29025);
                           class252.field3438 = true;
                           class606.method4412(arg1 + -9114);
                           class188.method1492(~arg1);
                           class756.method5492((byte)106, field6009[104]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[18])) {
                           class331.method2445(false, -1, 1, false, -1);
                           if (class713.method5178(-117) == 1) {
                              class756.method5492((byte)106, field6009[81]);
                              return;
                           }

                           class756.method5492((byte)106, field6009[37]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[72])) {
                           class331.method2445(false, -1, 2, false, -1);
                           if (class713.method5178(-24) != 2) {
                              class756.method5492((byte)106, field6009[135]);
                              return;
                           }

                           class756.method5492((byte)106, field6009[102]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[206])) {
                           class331.method2445(false, 768, 3, false, 1024);
                           if (class713.method5178(arg1 + -8) == 3) {
                              class756.method5492((byte)106, field6009[149]);
                              return;
                           }

                           class756.method5492((byte)106, field6009[165]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[47])) {
                           class42.method358(0, -3, false);
                           if (~class300.field4107.field6419.method391(arg1 + 123) != -1) {
                              class756.method5492((byte)106, field6009[128]);
                              return;
                           }

                           class756.method5492((byte)106, field6009[27]);
                           class300.field4107.method3301(arg1 + 25349, class300.field4107.field6406, 0);
                           class441.method3246(0);
                           class539.field7710 = false;
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[94])) {
                           class42.method358(1, -3, false);
                           if (~class300.field4107.field6419.method391(97) == -2) {
                              class756.method5492((byte)106, field6009[195]);
                              class300.field4107.method3301(25349, class300.field4107.field6406, 1);
                              class441.method3246(0);
                              class539.field7710 = false;
                              return;
                           }

                           class756.method5492((byte)106, field6009[178]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[190])) {
                           class42.method358(2, -3, false);
                           if (class300.field4107.field6419.method391(arg1 + -124) == 2) {
                              class756.method5492((byte)106, field6009[90]);
                              class300.field4107.method3301(25349, class300.field4107.field6406, 2);
                              class441.method3246(arg1);
                              class539.field7710 = false;
                              return;
                           }

                           class756.method5492((byte)106, field6009[80]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[85])) {
                           class42.method358(3, -3, false);
                           if (~class300.field4107.field6419.method391(arg1 ^ -110) == -4) {
                              class756.method5492((byte)106, field6009[205]);
                              class300.field4107.method3301(25349, class300.field4107.field6406, 3);
                              class441.method3246(0);
                              class539.field7710 = false;
                              return;
                           }

                           class756.method5492((byte)106, field6009[151]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[134])) {
                           class42.method358(5, arg1 ^ -3, false);
                           if (~class300.field4107.field6419.method391(-127) == -6) {
                              class756.method5492((byte)106, field6009[63]);
                              class300.field4107.method3301(25349, class300.field4107.field6406, 5);
                              class441.method3246(0);
                              class539.field7710 = false;
                              return;
                           }

                           class756.method5492((byte)106, field6009[68]);
                           return;
                        }

                        if (arg3.startsWith(field6009[95])) {
                           if (arg3.length() < 6) {
                              class756.method5492((byte)106, field6009[199]);
                              return;
                           }

                           int var17 = class327.method2424((byte)127, arg3.substring(6));
                           if (var17 >= 0 && var17 <= class267.method2066(class409.field5915, (byte)-123)) {
                              class300.field4107.method3301(arg1 ^ 25349, class300.field4107.field6429, var17);
                              class441.method3246(arg1);
                              class539.field7710 = false;
                              class756.method5492((byte)106, field6009[28] + class300.field4107.field6429.method364(91));
                              return;
                           }

                           class756.method5492((byte)106, field6009[199]);
                           return;
                        }

                        if (arg3.startsWith(field6009[159])) {
                           if (arg3.length() < 10) {
                              class756.method5492((byte)106, field6009[189]);
                              return;
                           }

                           class368.field5029 = class327.method2424((byte)119, arg3.substring(10).trim());
                           class756.method5492((byte)106, field6009[98] + class368.field5029);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[133])) {
                           class661.field9629 = true;
                           class756.method5492((byte)106, field6009[127] + class661.field9629);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[105])) {
                           class96.field1235 = !class96.field1235;
                           class756.method5492((byte)106, field6009[97] + class96.field1235);
                           return;
                        }

                        if (arg3.startsWith(field6009[33])) {
                           boolean var18 = class383.field5543.method528();
                           if (!class137.method1087(!var18, arg1)) {
                              class756.method5492((byte)106, field6009[145]);
                              return;
                           }

                           if (!var18) {
                              class756.method5492((byte)106, field6009[158]);
                              return;
                           }

                           class756.method5492((byte)106, field6009[83]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[89])) {
                           if (!class112.field1408) {
                              class112.field1408 = true;
                              class756.method5492((byte)106, field6009[61]);
                              return;
                           }

                           class112.field1408 = false;
                           class756.method5492((byte)106, field6009[93]);
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[22])) {
                           if (!class445.field6335) {
                              class756.method5492((byte)106, field6009[198]);
                              class445.field6335 = true;
                              return;
                           }

                           class756.method5492((byte)106, field6009[42]);
                           class445.field6335 = false;
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[44])) {
                           class756.method5492((byte)106, field6009[51] + (class564.field8045.field10694 >> 9) + field6009[120] + (class564.field8045.field10693 >> 9));
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[46])) {
                           class756.method5492((byte)106, field6009[14] + class731.field10698[class564.field8045.field10701].method2219(true, class564.field8045.field10694 >> 9, class564.field8045.field10693 >> 9));
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[58])) {
                           class281.field3904.method2029(arg1 ^ -2);
                           class281.field3904.method2046(126);
                           class294.field4046.method4595(false);
                           class61.field747.method5667((byte)-24);
                           class188.method1492(~arg1);
                           class756.method5492((byte)106, field6009[170]);
                           return;
                        }

                        if (arg3.startsWith(field6009[143])) {
                           if (!class383.field5543.method583()) {
                              class756.method5492((byte)106, field6009[40]);
                              return;
                           }

                           int var19;
                           label596: {
                              var19 = Integer.parseInt(arg3.substring(3));
                              if (var19 >= 1) {
                                 if (~var19 >= -5) {
                                    break label596;
                                 }

                                 var19 = 4;
                                 if (!var4) {
                                    break label596;
                                 }
                              }

                              var19 = 1;
                           }

                           class597.field8778 = var19;
                           class606.method4412(-9114);
                           class756.method5492((byte)106, field6009[60] + class597.field8778);
                           return;
                        }

                        if (arg3.startsWith(field6009[19])) {
                           class756.method5492((byte)106, field6009[65] + class493.field7038.method718(arg1 ^ -86) + "/" + class493.field7038.method730((byte)99));
                           class756.method5492((byte)106, field6009[106] + class409.field5909.method718(-120) + "/" + class409.field5909.method730((byte)-87));
                           class756.method5492((byte)106, field6009[184] + class468.field6728.field4154.method3473(13629) + "/" + class468.field6728.field4154.method3476(135));
                           return;
                        }

                        if (arg3.equalsIgnoreCase(field6009[92])) {
                           class756.method5492((byte)106, field6009[75] + class564.field8045.field10701 + "," + ((class224.field3188 >> 9) + class672.field9740 >> 6) + "," + ((class782.field11465 >> 9) + class533.field7595 >> 6) + "," + (63 & (class224.field3188 >> 9) - -class672.field9740) + "," + (63 & (class782.field11465 >> 9) + class533.field7595) + field6009[138] + (class102.method851(class564.field8045.field10701, (byte)127, class224.field3188, class782.field11465) - class421.field6021));
                           class756.method5492((byte)106, field6009[131] + class564.field8045.field10701 + "," + (class672.field9740 + class27.field415 >> 6) + "," + (class533.field7595 + class188.field2679 >> 6) + "," + (class672.field9740 + class27.field415 & 63) + "," + (63 & class533.field7595 + class188.field2679) + field6009[138] + (class102.method851(class564.field8045.field10701, (byte)127, class27.field415, class188.field2679) - class102.field1309));
                           return;
                        }

                        if (!arg3.equals(field6009[6]) && !arg3.equals(field6009[162])) {
                           if (arg3.startsWith(field6009[41])) {
                              int var20 = -1;
                              int var21 = 1000;
                              if (~arg3.length() < -16) {
                                 String[] var22 = class527.method3811(-29619, arg3, ' ');

                                 try {
                                    if (~var22.length < -2) {
                                       var21 = Integer.parseInt(var22[1]);
                                    }
                                 } catch (Throwable var51) {
                                 }

                                 try {
                                    if (~var22.length < -3) {
                                       var20 = Integer.parseInt(var22[2]);
                                    }
                                 } catch (Throwable var50) {
                                 }
                              }

                              if (~var20 != 0) {
                                 class756.method5492((byte)106, field6009[5] + class8.method40((byte)118, var21, var20));
                                 return;
                              }

                              class756.method5492((byte)106, field6009[29] + class8.method40((byte)101, var21, 0));
                              class756.method5492((byte)106, field6009[38] + class8.method40((byte)90, var21, 2));
                              class756.method5492((byte)106, field6009[9] + class8.method40((byte)95, var21, 3));
                              class756.method5492((byte)106, field6009[188] + class8.method40((byte)100, var21, 1));
                              class756.method5492((byte)106, field6009[74] + class8.method40((byte)100, var21, 5));
                              return;
                           }

                           if (arg3.equals(field6009[144])) {
                              class679.field10018 = !class679.field10018;
                              class756.method5492((byte)106, field6009[174] + class679.field10018);
                              return;
                           }

                           if (arg3.equals(field6009[53])) {
                              class70.method651((byte)-63);
                              class756.method5492((byte)106, field6009[99]);
                              return;
                           }

                           if (arg3.startsWith(field6009[52])) {
                              int var23 = Integer.parseInt(arg3.substring(12));
                              class7.method36(var23, arg1 + 94, class137.method1086(var23, arg1).field7297);
                              class756.method5492((byte)106, field6009[193]);
                              return;
                           }

                           if (arg3.equals(field6009[173])) {
                              class756.method5492((byte)106, field6009[43] + class526.field7533.field6156);
                              return;
                           }

                           if (arg3.startsWith(field6009[153])) {
                              class10 var24 = class292.method2192(-9730);
                              class447 var25 = class40.method350(class651.field9540, var24.field106, true);
                              var25.field6359.method1186(0, 0);
                              int var26 = var25.field6359.field1856;
                              int var27 = arg3.indexOf(" ", 4);
                              var25.field6359.method1195((byte)113, arg3.substring(3, var27));
                              class99.method833((byte)89, arg3.substring(var27), var25.field6359);
                              var25.field6359.method1142(-var26 + var25.field6359.field1856, 122);
                              var24.method55(13256, var25);
                              return;
                           }

                           if (arg3.equals(field6009[64])) {
                              class382.method2889((byte)47);
                              class756.method5492((byte)106, field6009[147]);
                              return;
                           }

                           if (!arg3.equals(field6009[23])) {
                              if (arg3.equals(field6009[115])) {
                                 class587.field8681 = true;
                                 class188.method1492(-1);
                                 class756.method5492((byte)106, field6009[164]);
                                 return;
                              }

                              if (arg3.equals(field6009[169])) {
                                 class587.field8681 = false;
                                 class188.method1492(-1);
                                 class756.method5492((byte)106, field6009[185]);
                                 return;
                              }

                              if (arg3.equals(field6009[166])) {
                                 class84.method750(-79);
                                 class756.method5492((byte)106, field6009[26]);
                                 return;
                              }

                              if (arg3.equals(field6009[10])) {
                                 class756.method5492((byte)106, class608.method4428(100) + field6009[31]);
                                 return;
                              }

                              if (arg3.startsWith(field6009[203])) {
                                 int var29 = Integer.parseInt(arg3.substring(17));
                                 class756.method5492((byte)106, field6009[13] + class21.field248.method449(true, var29));
                                 return;
                              }

                              if (arg3.startsWith(field6009[168])) {
                                 int var30 = Integer.parseInt(arg3.substring(14));
                                 class756.method5492((byte)106, field6009[78] + class21.field248.method447(arg1 + -1, var30));
                                 return;
                              }

                              if (arg3.startsWith(field6009[3])) {
                                 String[] var31 = class527.method3811(-29619, arg3.substring(12), ' ');
                                 if (var31.length >= 2) {
                                    int var32 = ~var31.length < -3 ? Integer.parseInt(var31[2]) : 0;
                                    class391.method2972(65280, var32, var31[0], var31[1]);
                                    return;
                                 }
                              }

                              if (arg3.startsWith(field6009[107])) {
                                 String[] var33 = class527.method3811(-29619, arg3.substring(8), ' ');
                                 int var34 = Integer.parseInt(var33[0]);
                                 int var35 = ~var33.length != -3 ? 0 : Integer.parseInt(var33[1]);
                                 class182.method1444(var35, arg1 ^ 6, var34);
                                 return;
                              }

                              if (arg3.startsWith(field6009[91])) {
                                 class200.method1588();
                                 return;
                              }

                              if (arg3.startsWith(field6009[48])) {
                                 class200.method1590(100, false);
                                 return;
                              }

                              if (arg3.startsWith(field6009[73])) {
                                 class200.method1590(10, true);
                                 return;
                              }

                              if (arg3.startsWith(field6009[101])) {
                                 int var36 = Integer.parseInt(arg3.substring(8));
                                 class383.field5543.method530(var36);
                                 return;
                              }

                              if (arg3.equals(field6009[32])) {
                                 class756.method5492((byte)106, field6009[35] + class280.field3897.method4812());
                                 return;
                              }

                              if (arg3.equals(field6009[57])) {
                                 class360.method2701((byte)-117);
                                 class756.method5492((byte)106, field6009[4] + class300.field4107.field6419.method391(arg1 ^ -24));
                                 return;
                              }

                              if (arg3.equals(field6009[194])) {
                                 class756.method5492((byte)106, class220.field3148.method2337(arg1 ^ 119));
                                 return;
                              }

                              if (arg3.equals(field6009[79])) {
                                 label604: {
                                    if (!class619.field9120.startsWith(field6009[155])) {
                                       class405.method3049((byte)-111, false, new File(field6009[186]));
                                       if (!var4) {
                                          break label604;
                                       }
                                    }

                                    class405.method3049((byte)-111, false, new File(field6009[142]));
                                 }

                                 class756.method5492((byte)106, field6009[71]);
                                 return;
                              }

                              if (arg3.equals(field6009[36])) {
                                 class756.method5492((byte)106, field6009[21] + class619.field9120);
                                 class756.method5492((byte)106, field6009[196] + class619.field9129);
                                 class756.method5492((byte)106, field6009[123] + class619.field9121);
                                 return;
                              }

                              if (arg3.startsWith(field6009[114])) {
                                 int var37 = Integer.parseInt(arg3.substring(8, 9));
                                 class713.field10395 = var37;
                                 class606.method4412(-9114);
                                 class756.method5492((byte)106, field6009[204]);
                                 return;
                              }

                              if (arg3.startsWith(field6009[54])) {
                                 int var38 = arg3.indexOf(32);
                                 if (var38 < 0) {
                                    class756.method5492((byte)106, field6009[132]);
                                    return;
                                 }

                                 int var39 = class327.method2424((byte)-91, arg3.substring(var38 + 1));
                                 class300.field4107.method3301(25349, class300.field4107.field6442, var39);
                                 class441.method3246(arg1);
                                 class539.field7710 = false;
                                 class217.method1712(arg1 + 28041);
                                 if (~var39 != ~class300.field4107.field6442.method1028(arg1 ^ 102)) {
                                    class756.method5492((byte)106, field6009[76]);
                                    return;
                                 }

                                 class756.method5492((byte)106, field6009[1]);
                                 return;
                              }

                              if (arg3.startsWith(field6009[113])) {
                                 if (class300.field4107.field6442.method1028(106) == 0) {
                                    class756.method5492((byte)106, field6009[16]);
                                    return;
                                 }

                                 int var40 = class327.method2424((byte)124, arg3.substring(1 + arg3.indexOf(32)));
                                 class298.field4090 = var40;
                                 class756.method5492((byte)106, field6009[187] + class298.field4090);
                                 return;
                              }

                              if (arg3.startsWith(field6009[70])) {
                                 int var41 = class327.method2424((byte)122, arg3.substring(1 + arg3.indexOf(32)));
                                 class583.field8642 = var41;
                                 class704.field10281 = var41;
                                 class756.method5492((byte)106, field6009[11] + var41);
                                 class217.method1712(28041);
                                 return;
                              }

                              if (arg3.equals(field6009[69])) {
                                 class357.field4792 = !class357.field4792;
                                 class756.method5492((byte)106, field6009[122] + (class357.field4792 ? field6009[150] : field6009[191]));
                                 return;
                              }

                              if (arg3.startsWith(field6009[201])) {
                                 File var42 = new File(arg3.substring(10));
                                 if (var42.exists()) {
                                    var42 = new File(arg3.substring(10) + "." + class133.method1054(-29025) + field6009[12]);
                                    if (var42.exists()) {
                                       class756.method5492((byte)106, field6009[45]);
                                       return;
                                    }
                                 }

                                 if (class768.field11317 != null) {
                                    class768.field11317.close();
                                    class768.field11317 = null;
                                 }

                                 try {
                                    class768.field11317 = new FileOutputStream(var42);
                                    return;
                                 } catch (FileNotFoundException var52) {
                                    class756.method5492((byte)106, field6009[197] + var42.getName());
                                    return;
                                 } catch (SecurityException var53) {
                                    class756.method5492((byte)106, field6009[7] + var42.getName());
                                    return;
                                 }
                              }

                              if (arg3.equals(field6009[15])) {
                                 if (class768.field11317 != null) {
                                    class768.field11317.close();
                                 }

                                 class768.field11317 = null;
                                 return;
                              }

                              if (arg3.startsWith(field6009[161])) {
                                 File var43 = new File(arg3.substring(10));
                                 if (!var43.exists()) {
                                    class756.method5492((byte)106, field6009[171]);
                                    return;
                                 }

                                 byte[] var44 = class119.method953(var43, false);
                                 if (var44 == null) {
                                    class756.method5492((byte)106, field6009[49]);
                                    return;
                                 }

                                 String[] var45 = class527.method3811(-29619, class498.method3612((byte)60, '\r', class558.method4003(var44, arg1 + -18145), ""), '\n');
                                 class535.method3869(var45, (byte)115);
                              }

                              if (arg3.startsWith(field6009[34])) {
                                 short var46 = (short)class327.method2424((byte)125, arg3.substring(5));
                                 if (~var46 < -1) {
                                    class435.field6232 = var46;
                                 }

                                 return;
                              }

                              if (arg3.startsWith(field6009[77])) {
                                 if (~arg3.length() < -10 && arg3.charAt(8) == ' ') {
                                    class200.field2869 = arg3.substring(9);
                                    class200.field2867 = true;
                                    class756.method5492((byte)106, field6009[180] + class200.field2869 + ")");
                                    return;
                                 }

                                 class200.field2869 = null;
                                 class200.field2867 = !class200.field2867;
                                 class756.method5492((byte)106, field6009[146] + class200.field2867);
                                 return;
                              }

                              if (~class622.field9156 == -12) {
                                 ++class555.field7938;
                                 class447 var47 = class40.method350(class612.field8980, class430.field6150.field106, true);
                                 var47.field6359.method1186(arg3.length() - -3, arg1);
                                 var47.field6359.method1186(arg2 ? 1 : 0, 0);
                                 var47.field6359.method1186(arg0 ? 1 : 0, 0);
                                 var47.field6359.method1195((byte)87, arg3);
                                 class430.field6150.method55(13256, var47);
                              }

                              if (arg3.startsWith(field6009[160]) && class435.field6230 != class290.field4016) {
                                 class744.method5390(class327.method2424((byte)117, arg3.substring(4)), 1);
                                 return;
                              }
                              break label787;
                           }

                           int var28 = 0;
                           if (var4) {
                              if (class20.field222[var28]) {
                                 class14.field164[var28] = (int)(Math.random() * 99999.0D);
                                 if (Math.random() > 0.5D) {
                                    class14.field164[var28] *= -1;
                                 }
                              }

                              ++var28;
                           }

                           while(true) {
                              while(~class14.field164.length < ~var28) {
                                 if (class20.field222[var28]) {
                                    class14.field164[var28] = (int)(Math.random() * 99999.0D);
                                    if (Math.random() > 0.5D) {
                                       class14.field164[var28] *= -1;
                                    }
                                 }

                                 ++var28;
                              }

                              class382.method2889((byte)47);
                              class756.method5492((byte)106, field6009[55]);
                              if (!var4) {
                                 return;
                              }

                              ++var28;
                           }
                        }

                        class102.field1313 = !class102.field1313;
                        class383.field5543.method611(class102.field1313);
                        class103.method856(118);
                        class756.method5492((byte)106, field6009[67] + class102.field1313);
                        return;
                     }

                     class316.field4304.method4498(5000);
                     class10[] var14 = class430.field6154;
                     int var15 = 0;
                     class10 var16;
                     if (var4) {
                        var16 = var14[var15];
                        if (var16.field102 != null) {
                           var16.field102.method1378(-49);
                        }

                        ++var15;
                     }

                     while(var15 < var14.length) {
                        var16 = var14[var15];
                        if (var16.field102 != null) {
                           var16.field102.method1378(-49);
                        }

                        ++var15;
                     }

                     class667.field9694.method3011(arg1 + -1);
                     class756.method5492((byte)106, field6009[24]);
                     return;
                  }

                  class276.method2100(0);
                  int var6 = 0;
                  if (var4) {
                     System.gc();
                     ++var6;
                  }

                  while(true) {
                     if (~var6 <= -11) {
                        Runtime var7 = Runtime.getRuntime();
                        int var8 = (int)((var7.totalMemory() + -var7.freeMemory()) / 1024L);
                        class756.method5492((byte)106, field6009[125] + var8 + "k");
                        if (!var4) {
                           return;
                        }
                     } else {
                        System.gc();
                     }

                     ++var6;
                  }
               }
            } catch (Exception var54) {
               class756.method5492((byte)106, class180.field2481.method1437(class608.field8920, 50));
               return;
            }
         }

         if (class622.field9156 != 11) {
            class756.method5492((byte)106, class180.field2482.method1437(class608.field8920, 50) + arg3);
         }
      } catch (RuntimeException var56) {
         throw class237.method1823(var56, field6009[207] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field6009[139] : field6009[50]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3121(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!br",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3122(char[] arg0) {
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
            var10005 = 3;
            break;
         case 2:
            var10005 = 26;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
