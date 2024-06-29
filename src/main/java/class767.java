import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class767 {
   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11328 = new String[]{method5609(method5608("Pxvcl")), method5609(method5608("\f.*T*Ng6F~\u0000")), method5609(method5608("po*U-Cb=\u00017Y},D)\u0000m7T*T4x")), method5609(method5608("[ v\u000f9")), method5609(method5608("ec1U0E|+\u001bd")), method5609(method5608("\u000e.\fH)E.,@/E`b\u0001")), method5609(method5608("N{4M")), method5609(method5608("M}")), method5609(method5608("Pxvbl")), method5609(method5608("\u0000^9S0Im4D7\u001a.")), method5609(method5608("Pxvdl")), method5609(method5608("Pxv`l")), method5609(method5608("Pxvel"))};
   @OriginalMember(
      owner = "client!pv",
      name = "e",
      descriptor = "[F"
   )
   public static float[] field11324 = new float[4];
   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "I"
   )
   public static int field11322;
   @OriginalMember(
      owner = "client!pv",
      name = "b",
      descriptor = "I"
   )
   public static int field11323;
   @OriginalMember(
      owner = "client!pv",
      name = "d",
      descriptor = "I"
   )
   public static int field11326;
   @OriginalMember(
      owner = "client!pv",
      name = "f",
      descriptor = "I"
   )
   public static int field11327;
   @OriginalMember(
      owner = "client!pv",
      name = "c",
      descriptor = "Ljq;"
   )
   public static class672 field11325;

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(BI)V"
   )
   public static final void method5603(byte arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field11323;
         if (class303.field4736 == null) {
            class303.field4736 = new byte[4][class513.field7828][class475.field7230];
         }

         int var3 = arg1;
         if (var2 || arg1 < 4) {
            do {
               int var4 = 0;
               if (var2 || var4 < class513.field7828) {
                  do {
                     int var5 = 0;
                     if (var2) {
                        class303.field4736[var3][var4][var5] = arg0;
                        ++var5;
                     }

                     while(true) {
                        while(~class475.field7230 < ~var5) {
                           class303.field4736[var3][var4][var5] = arg0;
                           ++var5;
                        }

                        if (!var2) {
                           ++var4;
                           break;
                        }

                        ++var5;
                     }
                  } while(var4 < class513.field7828);
               }

               ++var3;
            } while(var3 < 4);

         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field11328[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(IIB)V"
   )
   public static final void method5604(int arg0, int arg1, byte arg2) {
      try {
         ++field11326;
         if (arg2 != 37) {
            field11324 = null;
         }

         class566 var3 = class146.method1321((long)arg0, 17, -1428737160);
         var3.method4269((byte)-116);
         var3.field8394 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field11328[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method5605(boolean arg0) {
      try {
         field11324 = null;
         if (arg0) {
            method5603((byte)115, 117);
         }

         field11325 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11328[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(IJLha;)V"
   )
   public static final void method5606(int arg0, long arg1, class610 arg2) {
      boolean var4 = client.field1786;

      try {
         ++field11322;
         class332.field5028 = 0;
         class528.field8019 = class738.field10973;
         class238.field3619 = 0;
         if (arg0 != -21362) {
            method5606(-38, 101L, (class610)null);
         }

         class738.field10973 = 0;
         long var5 = class162.method1442(14080);
         class743 var7 = (class743)class580.field8572.method1815(1);
         if (var4) {
            if (var7.method5452(arg2, arg1)) {
               ++class332.field5028;
            }

            var7 = (class743)class580.field8572.method1817(arg0 ^ -21362);
         }

         while(true) {
            boolean var10000;
            if (var7 == null) {
               var10000 = class568.field8409;
               if (!var4) {
                  if (var10000 && ~(arg1 % 100L) == -1L) {
                     System.out.println(field11328[2] + class580.field8572.method1819(arg0 + 21362) + field11328[1] + class332.field5028);
                     System.out.println(field11328[4] + class238.field3619 + field11328[9] + class738.field10973 + field11328[5] + (class162.method1442(14080) - var5) + field11328[7]);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = var7.method5452(arg2, arg1);
            }

            if (var10000) {
               ++class332.field5028;
            }

            var7 = (class743)class580.field8572.method1817(arg0 ^ -21362);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11328[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11328[3] : field11328[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "a",
      descriptor = "(IILha;IIIII)V"
   )
   public static final void method5607(int arg0, int arg1, class610 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
      try {
         class450.field6888 = arg2;
         ++field11327;
         class691.field10264 = class450.field6888.method624();
         class412.field6408 = class450.field6888.method624();
         class640.field9279 = class450.field6888.method624();
         if (arg7 >= 67) {
            class67.field883 = 1;
            class595.field8748 = null;
            class221.field3330 = arg6;
            class37.field444 = arg1;
            class686.field10198 = arg5;
            class249.field3781 = 0;
            class155.field2316 = arg4;
            class25.field321 = 0;
            class6.method26(false, arg0, arg3);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field11328[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11328[3] : field11328[6]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5608(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5609(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 14;
            break;
         case 2:
            var10005 = 88;
            break;
         case 3:
            var10005 = 33;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
