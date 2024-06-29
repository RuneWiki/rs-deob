import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class701 {
   @OriginalMember(
      owner = "client!cda",
      name = "h",
      descriptor = "I"
   )
   public int field10101;
   @OriginalMember(
      owner = "client!cda",
      name = "f",
      descriptor = "I"
   )
   public int field10110;
   @OriginalMember(
      owner = "client!cda",
      name = "o",
      descriptor = "Ljava/lang/String;"
   )
   public String field10105;
   @OriginalMember(
      owner = "client!cda",
      name = "c",
      descriptor = "I"
   )
   public int field10099;
   @OriginalMember(
      owner = "client!cda",
      name = "p",
      descriptor = "Ljava/lang/String;"
   )
   public String field10106;
   @OriginalMember(
      owner = "client!cda",
      name = "i",
      descriptor = "Ljava/lang/String;"
   )
   public String field10108;
   @OriginalMember(
      owner = "client!cda",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field10103;
   @OriginalMember(
      owner = "client!cda",
      name = "g",
      descriptor = "I"
   )
   public int field10109;
   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "I"
   )
   public int field10097;
   @OriginalMember(
      owner = "client!cda",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field10098;
   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10111 = new String[]{method5124(method5123("I \u0007kX\u0002")), method5124(method5123("I \u0007k%C*\u000f1'\u0002")), method5124(method5123("D1\n)")), method5124(method5123("QjHkd")), method5124(method5123("I \u0007k[\u0002")), method5124(method5123("I \u0007kZ\u0002"))};
   @OriginalMember(
      owner = "client!cda",
      name = "j",
      descriptor = "I"
   )
   public static int field10095;
   @OriginalMember(
      owner = "client!cda",
      name = "e",
      descriptor = "I"
   )
   public static int field10102;
   @OriginalMember(
      owner = "client!cda",
      name = "b",
      descriptor = "I"
   )
   public static int field10104;
   @OriginalMember(
      owner = "client!cda",
      name = "n",
      descriptor = "Lns;"
   )
   public static class382 field10096;
   @OriginalMember(
      owner = "client!cda",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public static String field10100;
   @OriginalMember(
      owner = "client!cda",
      name = "k",
      descriptor = "[[I"
   )
   public static int[][] field10107;

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;B)V"
   )
   public final void method5120(int arg0, String arg1, String arg2, int arg3, String arg4, int arg5, String arg6, String arg7, byte arg8) {
      try {
         ++field10095;
         if (arg8 != 11) {
            field10100 = null;
         }

         this.field10101 = class399.method3108((byte)-4);
         this.field10103 = arg7;
         this.field10098 = arg6;
         this.field10099 = arg5;
         this.field10110 = arg0;
         this.field10097 = arg3;
         this.field10105 = arg1;
         this.field10108 = arg2;
         this.field10109 = class51.field770;
         this.field10106 = arg4;
      } catch (RuntimeException var11) {
         throw class612.method4503(var11, field10111[5] + arg0 + ',' + (arg1 != null ? field10111[3] : field10111[2]) + ',' + (arg2 != null ? field10111[3] : field10111[2]) + ',' + arg3 + ',' + (arg4 != null ? field10111[3] : field10111[2]) + ',' + arg5 + ',' + (arg6 != null ? field10111[3] : field10111[2]) + ',' + (arg7 != null ? field10111[3] : field10111[2]) + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(ZIIJ)Ljava/lang/String;"
   )
   public static final String method5121(boolean arg0, int arg1, int arg2, long arg3) {
      try {
         ++field10104;
         if (arg1 != -17793) {
            method5122(-79);
         }

         Calendar var5;
         label17: {
            if (!arg0) {
               class623.method4590(false, arg3);
               var5 = class309.field4659;
               if (!client.field10022) {
                  break label17;
               }
            }

            class570.method4225(arg3, arg1 + 5411);
            var5 = class309.field4655;
         }

         int var6 = var5.get(5);
         int var7 = 1 + var5.get(2);
         int var8 = var5.get(1);
         int var9 = var5.get(11);
         int var10 = var5.get(12);
         return Integer.toString(var6 / 10) + var6 % 10 + "/" + var7 / 10 + var7 % 10 + "/" + var8 % 100 / 10 + var8 % 10 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
      } catch (RuntimeException var12) {
         throw class612.method4503(var12, field10111[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5122(int arg0) {
      try {
         field10100 = null;
         if (arg0 != 10) {
            method5122(114);
         }

         field10096 = null;
         field10107 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field10111[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "<init>",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V"
   )
   public class701(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
      try {
         this.field10101 = class399.method3108((byte)-4);
         this.field10110 = arg0;
         this.field10105 = arg7;
         this.field10099 = arg6;
         this.field10106 = arg3;
         this.field10108 = arg2;
         this.field10103 = arg5;
         this.field10109 = class51.field770;
         this.field10097 = arg1;
         this.field10098 = arg4;
      } catch (RuntimeException var10) {
         throw class612.method4503(var10, field10111[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10111[3] : field10111[2]) + ',' + (arg3 != null ? field10111[3] : field10111[2]) + ',' + (arg4 != null ? field10111[3] : field10111[2]) + ',' + (arg5 != null ? field10111[3] : field10111[2]) + ',' + arg6 + ',' + (arg7 != null ? field10111[3] : field10111[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5123(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5124(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 68;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
