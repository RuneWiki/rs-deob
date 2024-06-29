import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class608 {
   @OriginalMember(
      owner = "client!aca",
      name = "i",
      descriptor = "I"
   )
   public int field8991;
   @OriginalMember(
      owner = "client!aca",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public String field8989;
   @OriginalMember(
      owner = "client!aca",
      name = "d",
      descriptor = "I"
   )
   public int field8992;
   @OriginalMember(
      owner = "client!aca",
      name = "e",
      descriptor = "Ljava/lang/String;"
   )
   public String field8988;
   @OriginalMember(
      owner = "client!aca",
      name = "l",
      descriptor = "Ljava/lang/String;"
   )
   public String field8993;
   @OriginalMember(
      owner = "client!aca",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   public String field8985;
   @OriginalMember(
      owner = "client!aca",
      name = "g",
      descriptor = "I"
   )
   public int field8995;
   @OriginalMember(
      owner = "client!aca",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field8990;
   @OriginalMember(
      owner = "client!aca",
      name = "f",
      descriptor = "I"
   )
   public int field8986;
   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "I"
   )
   public int field8996;
   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8998 = new String[]{method4501(method4500("^9C\u001bOV4KAM\u0017")), method4501(method4500("Dt\f\u001b\u000e")), method4501(method4500("Q/NY")), method4501(method4500("^9C\u001b1\u0017")), method4501(method4500("^9C\u001b0\u0017")), method4501(method4500("^9C\u001b2\u0017"))};
   @OriginalMember(
      owner = "client!aca",
      name = "c",
      descriptor = "I"
   )
   public static int field8987;
   @OriginalMember(
      owner = "client!aca",
      name = "k",
      descriptor = "I"
   )
   public static int field8994;
   @OriginalMember(
      owner = "client!aca",
      name = "j",
      descriptor = "[[[S"
   )
   public static short[][][] field8997;

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)V"
   )
   public final void method4497(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6, int arg7, String arg8) {
      try {
         ++field8994;
         this.field8991 = class5.method41(false);
         this.field8990 = arg2;
         this.field8985 = arg3;
         this.field8989 = arg8;
         this.field8986 = arg0;
         this.field8993 = arg6;
         this.field8992 = arg7;
         this.field8988 = arg4;
         this.field8995 = class413.field5678;
         if (arg1 != 624) {
            this.method4497(7, -109, (String)null, (String)null, (String)null, -118, (String)null, 75, (String)null);
         }

         this.field8996 = arg5;
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field8998[4] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8998[1] : field8998[2]) + ',' + (arg3 != null ? field8998[1] : field8998[2]) + ',' + (arg4 != null ? field8998[1] : field8998[2]) + ',' + arg5 + ',' + (arg6 != null ? field8998[1] : field8998[2]) + ',' + arg7 + ',' + (arg8 != null ? field8998[1] : field8998[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4498(int arg0) {
      try {
         if (arg0 != 3) {
            field8997 = null;
         }

         field8997 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field8998[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "a",
      descriptor = "(BIIII[B[BII)V"
   )
   public static final void method4499(byte arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte[] arg6, int arg7, int arg8) {
      boolean var9 = client.field1481;

      try {
         ++field8987;
         int var10 = -(arg7 >> 2);
         int var16 = -(arg7 & 3);
         if (arg0 >= -9) {
            field8997 = null;
         }

         int var11 = -arg3;
         if (var9 || var11 < 0) {
            label88:
            do {
               int var12 = var10;
               int var10001;
               if (var9) {
                  var10001 = arg4++;
                  arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg2++]);
                  int var17 = arg4++;
                  arg5[var17] = (byte)(arg5[var17] + -arg6[arg2++]);
                  int var18 = arg4++;
                  arg5[var18] = (byte)(arg5[var18] + -arg6[arg2++]);
                  int var19 = arg4++;
                  arg5[var19] = (byte)(arg5[var19] + -arg6[arg2++]);
                  var12 = var10 + 1;
               }

               while(true) {
                  while(var12 < 0) {
                     var10001 = arg4++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg2++]);
                     var10001 = arg4++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg2++]);
                     var10001 = arg4++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg2++]);
                     var10001 = arg4++;
                     arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg2++]);
                     ++var12;
                  }

                  int var13 = var16;
                  if (!var9) {
                     if (var9) {
                        var10001 = arg4++;
                        arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg2++]);
                        var13 = var16 + 1;
                     }

                     while(true) {
                        while(var13 < 0) {
                           var10001 = arg4++;
                           arg5[var10001] = (byte)(arg5[var10001] + -arg6[arg2++]);
                           ++var13;
                        }

                        arg2 += arg1;
                        arg4 += arg8;
                        if (!var9) {
                           ++var11;
                           continue label88;
                        }

                        ++var13;
                     }
                  }

                  ++var12;
               }
            } while(var11 < 0);

         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field8998[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8998[1] : field8998[2]) + ',' + (arg6 != null ? field8998[1] : field8998[2]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "<init>",
      descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V"
   )
   public class608(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
      try {
         this.field8991 = class5.method41(false);
         this.field8989 = arg5;
         this.field8992 = arg0;
         this.field8988 = arg7;
         this.field8993 = arg4;
         this.field8985 = arg2;
         this.field8995 = class413.field5678;
         this.field8990 = arg3;
         this.field8986 = arg1;
         this.field8996 = arg6;
      } catch (RuntimeException var10) {
         throw class93.method866(var10, field8998[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8998[1] : field8998[2]) + ',' + (arg3 != null ? field8998[1] : field8998[2]) + ',' + (arg4 != null ? field8998[1] : field8998[2]) + ',' + (arg5 != null ? field8998[1] : field8998[2]) + ',' + arg6 + ',' + (arg7 != null ? field8998[1] : field8998[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4500(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4501(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
