import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class792 {
   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11582 = new String[]{method5711(method5710("Q\u0017\u0005#\u001c")), method5711(method5710("Q\u0017\u0005 \u001c"))};
   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "I"
   )
   public static int field11579;
   @OriginalMember(
      owner = "client!rw",
      name = "c",
      descriptor = "I"
   )
   public static int field11580;
   @OriginalMember(
      owner = "client!rw",
      name = "b",
      descriptor = "I"
   )
   public static int field11581;

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(I)J"
   )
   public static final synchronized long method5708(int arg0) {
      try {
         if (arg0 != -25005) {
            return 51L;
         } else {
            ++field11579;
            long var1 = System.currentTimeMillis();
            if (class583.field7999 > var1) {
               class643.field9028 += -var1 + class583.field7999;
            }

            class583.field7999 = var1;
            return var1 - -class643.field9028;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field11582[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(IIBI)V"
   )
   public static final void method5709(int arg0, int arg1, byte arg2, int arg3) {
      boolean var4 = client.field4273;

      try {
         ++field11580;
         int var5 = class752.field10921 + arg3;
         int var6 = arg0 - -class17.field237;
         if (class111.field1404 != null && arg3 >= 0 && ~arg0 <= -1 && ~arg3 > ~class507.field7030 && class215.field2667 > arg0) {
            if (~class674.field9907.field8458.method2628((byte)-95) != -1 || class278.field3709.field1001 == arg1) {
               long var7 = (long)(arg1 << 28 | var6 << 14 | var5);
               class480 var9 = (class480)class2.field7.method1839(-120, var7);
               if (var9 == null) {
                  class759.method5455(arg1, arg3, arg0);
               } else {
                  class666 var10 = (class666)var9.field6636.method3855(arg2 ^ -107);
                  if (var10 == null) {
                     class759.method5455(arg1, arg3, arg0);
                  } else {
                     class219 var11;
                     label91: {
                        var11 = (class219)class759.method5455(arg1, arg3, arg0);
                        if (var11 == null) {
                           var11 = new class219(arg3 << 9, class93.field1241[arg1].method2221(false, arg0, arg3), arg0 << 9, arg1, arg1);
                           if (!var4) {
                              break label91;
                           }
                        }

                        var11.field2728 = var11.field2715 = -1;
                     }

                     if (arg2 == -30) {
                        var11.field2726 = var10.field9472;
                        var11.field2722 = var10.field9471;

                        int var10000;
                        int var10001;
                        label85:
                        while(true) {
                           class666 var12 = (class666)var9.field6636.method3866((byte)122);
                           if (var12 != null) {
                              label106: {
                                 var10000 = ~var12.field9471;
                                 var10001 = ~var11.field2722;
                                 if (var4) {
                                    break;
                                 }

                                 if (var10000 != var10001) {
                                    var11.field2728 = var12.field9471;
                                    var11.field2732 = var12.field9472;

                                    do {
                                       class666 var13;
                                       do {
                                          do {
                                             var13 = (class666)var9.field6636.method3866((byte)113);
                                             if (var13 == null) {
                                                break label106;
                                             }
                                          } while(var11.field2722 == var13.field9471);

                                          var10000 = ~var11.field2728;
                                          var10001 = ~var13.field9471;
                                          if (var4) {
                                             break label85;
                                          }
                                       } while(var10000 == var10001 && !var4);

                                       var11.field2729 = var13.field9472;
                                       var11.field2715 = var13.field9471;
                                    } while(!var4);
                                 }

                                 if (!var4) {
                                    continue;
                                 }
                              }
                           }

                           var10000 = (arg3 << 9) + 256;
                           var10001 = arg1;
                           break;
                        }

                        int var14 = class687.method5016(var10000, var10001, (arg0 << 9) + 256, 2);
                        var11.field1001 = (byte)arg1;
                        var11.field2727 = 0;
                        var11.field998 = var14;
                        var11.field1003 = arg0 << 9;
                        var11.field999 = arg3 << 9;
                        var11.field1005 = (byte)arg1;
                        if (class407.method3090(arg3, 1, arg0)) {
                           ++var11.field1005;
                        }

                        class109.method965(arg1, arg3, arg0, var14, var11);
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class534.method3846(var16, field11582[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5710(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 52);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5711(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 35;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 43;
            break;
         case 3:
            var10005 = 98;
            break;
         default:
            var10005 = 52;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
