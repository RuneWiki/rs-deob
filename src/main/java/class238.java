import java.applet.Applet;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public class class238 extends class604 {
   @OriginalMember(
      owner = "client!aia",
      name = "i",
      descriptor = "I"
   )
   private int field3006 = 0;
   @OriginalMember(
      owner = "client!aia",
      name = "s",
      descriptor = "Z"
   )
   public boolean field3012 = false;
   @OriginalMember(
      owner = "client!aia",
      name = "v",
      descriptor = "Liq;"
   )
   public class631 field3013 = new class631();
   @OriginalMember(
      owner = "client!aia",
      name = "t",
      descriptor = "Liq;"
   )
   private class631 field3018 = new class631();
   @OriginalMember(
      owner = "client!aia",
      name = "G",
      descriptor = "Z"
   )
   private boolean field3023 = false;
   @OriginalMember(
      owner = "client!aia",
      name = "o",
      descriptor = "J"
   )
   private long field3007;
   @OriginalMember(
      owner = "client!aia",
      name = "m",
      descriptor = "Lge;"
   )
   public class737 field3014;
   @OriginalMember(
      owner = "client!aia",
      name = "u",
      descriptor = "Lria;"
   )
   public class299 field3011;
   @OriginalMember(
      owner = "client!aia",
      name = "y",
      descriptor = "Lsaa;"
   )
   public class344 field3015;
   @OriginalMember(
      owner = "client!aia",
      name = "k",
      descriptor = "Lma;"
   )
   public class14 field3009;
   @OriginalMember(
      owner = "client!aia",
      name = "H",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3028 = new String[]{method1779(method1778("p\u0003z")), method1779(method1778("v\ng")), method1779(method1778("p\u0000u\u0006")), method1779(method1778("p\u0000v\u0006")), method1779(method1778("sE&")), method1779(method1778("p\u0013z")), method1779(method1778("sBw")), method1779(method1778("5\u001a.^\u0019\"\u00135I\u0018$X0HH5K")), method1779(method1778("sDt")), method1779(method1778("sDq")), method1779(method1778("8\u0003+W")), method1779(method1778("7\u001f&\u00155~")), method1779(method1778("-Xi\u0015\n")), method1779(method1778("7\u001f&\u0015K?\u0018.OI~")), method1779(method1778("7\u001f&\u00153~")), method1779(method1778("7\u001f&\u00156~")), method1779(method1778("7\u001f&\u00152~"))};
   @OriginalMember(
      owner = "client!aia",
      name = "q",
      descriptor = "Z"
   )
   public static boolean field3004 = false;
   @OriginalMember(
      owner = "client!aia",
      name = "n",
      descriptor = "I"
   )
   public static int field3005;
   @OriginalMember(
      owner = "client!aia",
      name = "j",
      descriptor = "I"
   )
   public static int field3008;
   @OriginalMember(
      owner = "client!aia",
      name = "A",
      descriptor = "I"
   )
   public static int field3010;
   @OriginalMember(
      owner = "client!aia",
      name = "w",
      descriptor = "I"
   )
   public static int field3016;
   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "I"
   )
   public int field3017;
   @OriginalMember(
      owner = "client!aia",
      name = "B",
      descriptor = "I"
   )
   private int field3019;
   @OriginalMember(
      owner = "client!aia",
      name = "p",
      descriptor = "I"
   )
   private int field3020;
   @OriginalMember(
      owner = "client!aia",
      name = "C",
      descriptor = "I"
   )
   private int field3021;
   @OriginalMember(
      owner = "client!aia",
      name = "F",
      descriptor = "I"
   )
   private int field3022;
   @OriginalMember(
      owner = "client!aia",
      name = "l",
      descriptor = "I"
   )
   private int field3024;
   @OriginalMember(
      owner = "client!aia",
      name = "x",
      descriptor = "I"
   )
   private int field3025;
   @OriginalMember(
      owner = "client!aia",
      name = "E",
      descriptor = "I"
   )
   private int field3027;
   @OriginalMember(
      owner = "client!aia",
      name = "D",
      descriptor = "Ljava/applet/Applet;"
   )
   public static Applet field3003;
   @OriginalMember(
      owner = "client!aia",
      name = "r",
      descriptor = "[[B"
   )
   public static byte[][] field3026;

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(JILha;)V"
   )
   public final void method1773(long param1, int param3, class66 param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(IZLha;IJ)V"
   )
   public final void method1774(int param1, boolean param2, class66 param3, int param4, long param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!aia",
      name = "c",
      descriptor = "(B)V"
   )
   public static void method1775(byte arg0) {
      try {
         field3026 = null;
         if (arg0 != -49) {
            method1775((byte)-96);
         }

         field3003 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field3028[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "a",
      descriptor = "(ILjava/lang/Throwable;Ljava/lang/String;)V"
   )
   public static final void method1776(int arg0, Throwable arg1, String arg2) {
      int var3 = client.field4530;
      ++field3005;

      try {
         String var4 = "";
         if (arg1 != null) {
            var4 = class661.method4748((byte)127, arg1);
         }

         if (arg2 != null) {
            if (arg1 != null) {
               var4 = var4 + field3028[1];
            }

            var4 = var4 + arg2;
         }

         class536.method3970(-1, var4);
         String var5 = class538.method3987(field3028[4], var4, (byte)-72, ":");
         String var6 = class538.method3987(field3028[6], var5, (byte)-72, "@");
         String var7 = class538.method3987(field3028[9], var6, (byte)-72, "&");
         String var8 = class538.method3987(field3028[8], var7, (byte)-72, "#");
         if (arg0 > -5) {
            method1776(117, (Throwable)null, (String)null);
         }

         if (class459.field6948 != null) {
            class12 var9 = class785.field11433.method5213(new URL(class459.field6948.getCodeBase(), field3028[7] + class440.field6706 + field3028[0] + (class703.field10540 == null ? String.valueOf(class764.field11225) : class703.field10540) + field3028[3] + class719.field10708 + field3028[2] + class719.field10705 + field3028[5] + var8), 1463071632);
            if (var3 != 0) {
               class89.method817(1L, 2535);
            }

            while(~var9.field159 == -1) {
               class89.method817(1L, 2535);
            }

            if (~var9.field159 == -2) {
               DataInputStream var10 = (DataInputStream)var9.field160;
               var10.read();
               var10.close();
            }
         }
      } catch (Exception var11) {
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1777(byte arg0) {
      try {
         label42: {
            this.field3013.field9173 = this.field3011.field4275;
            ++field3016;
            this.field3013.field9171 = this.field3011.field4262;
            this.field3013.field9179 = this.field3011.field4268;
            this.field3013.field9170 = this.field3011.field4280;
            this.field3013.field9168 = this.field3011.field4281;
            this.field3013.field9172 = this.field3011.field4271;
            this.field3013.field9174 = this.field3011.field4266;
            this.field3013.field9182 = this.field3011.field4263;
            this.field3013.field9180 = this.field3011.field4273;
            if (~this.field3013.field9174 != ~this.field3013.field9173 || this.field3013.field9173 != this.field3013.field9168 || this.field3013.field9182 != this.field3013.field9170 || ~this.field3013.field9172 != ~this.field3013.field9170 || ~this.field3013.field9180 != ~this.field3013.field9179 || this.field3013.field9180 != this.field3013.field9171) {
               if (!this.field3023) {
                  break label42;
               }

               this.field3018.field9180 = this.field3013.field9180;
               this.field3018.field9182 = this.field3013.field9182;
               this.field3018.field9168 = this.field3013.field9168;
               this.field3023 = false;
               this.field3018.field9171 = this.field3013.field9171;
               this.field3018.field9172 = this.field3013.field9172;
               this.field3018.field9173 = this.field3013.field9173;
               this.field3018.field9179 = this.field3013.field9179;
               this.field3018.field9170 = this.field3013.field9170;
               this.field3018.field9174 = this.field3013.field9174;
               if (client.field4530 == 0) {
                  break label42;
               }
            }

            this.field3023 = true;
         }

         int var2 = 18 % ((arg0 - 23) / 60);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field3028[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "<init>",
      descriptor = "(Lha;Lria;Lge;J)V"
   )
   public class238(class66 arg0, class299 arg1, class737 arg2, long arg3) {
      try {
         this.field3007 = arg3;
         this.field3014 = arg2;
         this.field3011 = arg1;
         this.field3015 = this.field3011.method2287((byte)60);
         if (!arg0.method567() && this.field3015.field5226 != -1) {
            this.field3015 = class165.method1344(this.field3015.field5226, 0);
         }

         this.field3009 = new class14();
         this.field3006 = (int)((double)this.field3006 + Math.random() * 64.0D);
         this.method1777((byte)-102);
         this.field3018.field9182 = this.field3013.field9182;
         this.field3018.field9168 = this.field3013.field9168;
         this.field3018.field9173 = this.field3013.field9173;
         this.field3018.field9180 = this.field3013.field9180;
         this.field3018.field9170 = this.field3013.field9170;
         this.field3018.field9172 = this.field3013.field9172;
         this.field3018.field9174 = this.field3013.field9174;
         this.field3018.field9179 = this.field3013.field9179;
         this.field3018.field9171 = this.field3013.field9171;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field3028[13] + (arg0 != null ? field3028[12] : field3028[10]) + ',' + (arg1 != null ? field3028[12] : field3028[10]) + ',' + (arg2 != null ? field3028[12] : field3028[10]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1778(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1779(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 118;
            break;
         case 2:
            var10005 = 71;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
