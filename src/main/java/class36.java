import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class36 extends class294 {
   @OriginalMember(
      owner = "client!pn",
      name = "E",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field443 = new String[]{method263(method262("\u0005\u000bun>")), method263(method262("\u0005\u000buo>")), method263(method262("\u001b\u00107@")), method263(method262("\u000eKu\u0002k")), method263(method262("\u0005\u000buh>")), method263(method262("\u0005\u000bum>"))};
   @OriginalMember(
      owner = "client!pn",
      name = "A",
      descriptor = "I"
   )
   public static int field428 = 0;
   @OriginalMember(
      owner = "client!pn",
      name = "w",
      descriptor = "I"
   )
   public static int field427 = 0;
   @OriginalMember(
      owner = "client!pn",
      name = "y",
      descriptor = "Lvv;"
   )
   public static class308 field435 = new class308();
   @OriginalMember(
      owner = "client!pn",
      name = "s",
      descriptor = "I"
   )
   public static int field442 = 0;
   @OriginalMember(
      owner = "client!pn",
      name = "m",
      descriptor = "I"
   )
   public int field425;
   @OriginalMember(
      owner = "client!pn",
      name = "o",
      descriptor = "I"
   )
   public static int field426;
   @OriginalMember(
      owner = "client!pn",
      name = "p",
      descriptor = "I"
   )
   public static int field429;
   @OriginalMember(
      owner = "client!pn",
      name = "r",
      descriptor = "I"
   )
   public int field430;
   @OriginalMember(
      owner = "client!pn",
      name = "x",
      descriptor = "I"
   )
   public int field431;
   @OriginalMember(
      owner = "client!pn",
      name = "n",
      descriptor = "I"
   )
   public static int field433;
   @OriginalMember(
      owner = "client!pn",
      name = "t",
      descriptor = "I"
   )
   public int field434;
   @OriginalMember(
      owner = "client!pn",
      name = "u",
      descriptor = "I"
   )
   public int field436;
   @OriginalMember(
      owner = "client!pn",
      name = "C",
      descriptor = "I"
   )
   public int field439;
   @OriginalMember(
      owner = "client!pn",
      name = "D",
      descriptor = "Lfq;"
   )
   public class374 field440;
   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "Lfq;"
   )
   public class374 field441;
   @OriginalMember(
      owner = "client!pn",
      name = "q",
      descriptor = "Ljava/lang/String;"
   )
   public String field432;
   @OriginalMember(
      owner = "client!pn",
      name = "v",
      descriptor = "Z"
   )
   public boolean field438;
   @OriginalMember(
      owner = "client!pn",
      name = "B",
      descriptor = "[Ljava/lang/Object;"
   )
   public Object[] field437;

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(III)V"
   )
   public static final void method258(int arg0, int arg1, int arg2) {
      try {
         ++field426;
         class566 var3 = class146.method1321((long)arg0, arg2, -1428737160);
         var3.method4269((byte)-120);
         var3.field8394 = arg1;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field443[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(B[[[Lika;)V"
   )
   public static final void method259(byte arg0, class190[][][] arg1) {
      boolean var2 = client.field1786;

      try {
         int var3 = 0;
         if (arg0 == -110) {
            while(var3 < arg1.length) {
               class190[][] var4 = arg1[var3];
               int var5 = 0;
               if (var2 || var5 < var4.length) {
                  do {
                     int var6 = 0;
                     if (var2 || var6 < var4[var5].length) {
                        do {
                           class190 var7 = var4[var5][var6];
                           if (var7 != null) {
                              if (var7.field2952 instanceof class434) {
                                 ((class434)var7.field2952).method232(124);
                              }

                              if (var7.field2953 instanceof class434) {
                                 ((class434)var7.field2953).method232(-95);
                                 if (var7.field2951 instanceof class434) {
                                    ((class434)var7.field2951).method232(126);
                                 }
                              } else if (var7.field2951 instanceof class434) {
                                 ((class434)var7.field2951).method232(126);
                              }

                              if (var7.field2960 instanceof class434) {
                                 ((class434)var7.field2960).method232(122);
                                 if (var7.field2955 instanceof class434) {
                                    ((class434)var7.field2955).method232(-50);
                                 }
                              } else if (var7.field2955 instanceof class434) {
                                 ((class434)var7.field2955).method232(-50);
                              }

                              class605 var8 = var7.field2962;
                              if (!var2 && var8 == null) {
                                 ++var6;
                              } else {
                                 do {
                                    class78 var9 = var8.field8839;
                                    if (var9 instanceof class434) {
                                       ((class434)var9).method232(-100);
                                    }

                                    var8 = var8.field8840;
                                 } while(var8 != null);

                                 ++var6;
                              }
                           } else {
                              ++var6;
                           }
                        } while(var6 < var4[var5].length);
                     }

                     ++var5;
                  } while(var5 < var4.length);
               }

               ++var3;
            }

            ++field433;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field443[1] + arg0 + ',' + (arg1 != null ? field443[3] : field443[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "b",
      descriptor = "(III)V"
   )
   public static final void method260(int arg0, int arg1, int arg2) {
      try {
         if (arg1 == -32684) {
            ++field429;
            class365 var3 = class476.field7237[arg2][arg0];
            if (var3 != null) {
               class124.field1792 = var3.field5638;
               class162.field2419 = var3.field5654;
               class154.field2304 = var3.field5639;
            }

            class253.method2136(true);
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field443[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method261(int arg0) {
      try {
         if (arg0 != 0) {
            method261(-118);
         }

         field435 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field443[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method262(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 22);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method263(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 117;
            break;
         case 1:
            var10005 = 101;
            break;
         case 2:
            var10005 = 91;
            break;
         case 3:
            var10005 = 44;
            break;
         default:
            var10005 = 22;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
