import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class754 {
   @OriginalMember(
      owner = "client!rl",
      name = "v",
      descriptor = "I"
   )
   public int field11156 = 8;
   @OriginalMember(
      owner = "client!rl",
      name = "j",
      descriptor = "I"
   )
   public int field11155 = 64;
   @OriginalMember(
      owner = "client!rl",
      name = "m",
      descriptor = "I"
   )
   public int field11154 = 0;
   @OriginalMember(
      owner = "client!rl",
      name = "g",
      descriptor = "I"
   )
   public int field11159 = 1190717;
   @OriginalMember(
      owner = "client!rl",
      name = "p",
      descriptor = "I"
   )
   public int field11160 = 127;
   @OriginalMember(
      owner = "client!rl",
      name = "l",
      descriptor = "I"
   )
   public int field11165 = -1;
   @OriginalMember(
      owner = "client!rl",
      name = "s",
      descriptor = "Z"
   )
   public boolean field11167 = true;
   @OriginalMember(
      owner = "client!rl",
      name = "d",
      descriptor = "I"
   )
   public int field11170 = 512;
   @OriginalMember(
      owner = "client!rl",
      name = "x",
      descriptor = "Z"
   )
   public boolean field11157 = false;
   @OriginalMember(
      owner = "client!rl",
      name = "h",
      descriptor = "Z"
   )
   public boolean field11176 = true;
   @OriginalMember(
      owner = "client!rl",
      name = "b",
      descriptor = "I"
   )
   public int field11178 = -1;
   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11179 = new String[]{method5477(method5476("$|r]V")), method5477(method5476("8e0t")), method5477(method5476("->r6\u0003")), method5477(method5476("$|rZV")), method5477(method5476("$|r\\V")), method5477(method5476("$|r^V")), method5477(method5476("$|r[V")), method5477(method5476("$|rYV"))};
   @OriginalMember(
      owner = "client!rl",
      name = "i",
      descriptor = "Lek;"
   )
   public static class536 field11163 = new class536(52, 1);
   @OriginalMember(
      owner = "client!rl",
      name = "n",
      descriptor = "[Z"
   )
   public static boolean[] field11172 = new boolean[8];
   @OriginalMember(
      owner = "client!rl",
      name = "k",
      descriptor = "I"
   )
   public static int field11171 = 0;
   @OriginalMember(
      owner = "client!rl",
      name = "q",
      descriptor = "Lek;"
   )
   public static class536 field11173 = new class536(29, 7);
   @OriginalMember(
      owner = "client!rl",
      name = "e",
      descriptor = "I"
   )
   public static int field11158;
   @OriginalMember(
      owner = "client!rl",
      name = "u",
      descriptor = "I"
   )
   public int field11161;
   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "I"
   )
   public static int field11162;
   @OriginalMember(
      owner = "client!rl",
      name = "c",
      descriptor = "I"
   )
   public static int field11164;
   @OriginalMember(
      owner = "client!rl",
      name = "f",
      descriptor = "I"
   )
   public static int field11166;
   @OriginalMember(
      owner = "client!rl",
      name = "y",
      descriptor = "I"
   )
   public static int field11168;
   @OriginalMember(
      owner = "client!rl",
      name = "w",
      descriptor = "I"
   )
   public static int field11174;
   @OriginalMember(
      owner = "client!rl",
      name = "o",
      descriptor = "I"
   )
   public static int field11175;
   @OriginalMember(
      owner = "client!rl",
      name = "t",
      descriptor = "Lvt;"
   )
   public class321 field11169;
   @OriginalMember(
      owner = "client!rl",
      name = "r",
      descriptor = "Ljava/lang/Object;"
   )
   public static Object field11177;

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(IZ)V",
      line = 3
   )
   public static final void method5470(int arg0, boolean arg1) {
      boolean var2 = client.field4360;

      try {
         ++field11162;
         if (arg1) {
            if (class185.field2623 != -1) {
               class214.method1690(class185.field2623, 102);
            }

            int var10000;
            label60: {
               class561 var3 = (class561)class191.field2708.method328(1745388291);
               if (var2) {
                  var10000 = var3.method3169(-11402);
               } else if (var3 == null) {
                  class185.field2623 = -1;
                  class191.field2708 = new class37(8);
                  class759.method5509(0);
                  class185.field2623 = class477.field6862;
                  class267.method2068(3, false);
                  class88.method775((byte)94);
                  var10000 = class185.field2623;
                  if (!var2) {
                     break label60;
                  }
               } else {
                  var10000 = var3.method3169(-11402);
               }

               label59:
               do {
                  while(true) {
                     if (var10000 == 0) {
                        var3 = (class561)class191.field2708.method328(arg0 ^ 1745388299);
                        if (var3 == null) {
                           if (!var2) {
                              class185.field2623 = -1;
                              class191.field2708 = new class37(8);
                              class759.method5509(0);
                              class185.field2623 = class477.field6862;
                              class267.method2068(3, false);
                              class88.method775((byte)94);
                              var10000 = class185.field2623;
                              break;
                           }

                           class757.method5496(var3, true, true, false);
                           var3 = (class561)class191.field2708.method325(-4629);
                        } else {
                           class757.method5496(var3, true, true, false);
                           var3 = (class561)class191.field2708.method325(-4629);
                        }
                     } else {
                        class757.method5496(var3, true, true, false);
                        var3 = (class561)class191.field2708.method325(-4629);
                     }

                     if (var3 == null) {
                        class185.field2623 = -1;
                        class191.field2708 = new class37(8);
                        class759.method5509(0);
                        class185.field2623 = class477.field6862;
                        class267.method2068(3, false);
                        class88.method775((byte)94);
                        var10000 = class185.field2623;
                        if (!var2) {
                           break label59;
                        }
                     } else {
                        var10000 = var3.method3169(-11402);
                     }
                  }
               } while(var2);
            }

            class200.method1591(var10000);
         }

         if (arg0 != 8) {
            field11174 = 101;
         }

         class197.field2777 = true;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11179[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(B)V",
      line = 58
   )
   public static void method5471(byte arg0) {
      try {
         field11177 = null;
         field11172 = null;
         field11173 = null;
         if (arg0 > -18) {
            field11174 = 49;
         }

         field11163 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11179[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(IB)Z",
      line = 76
   )
   public static final boolean method5472(int arg0, byte arg1) {
      try {
         if (arg1 >= -98) {
            return true;
         } else {
            ++field11166;
            return ~arg0 == -1 || ~arg0 == -3;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11179[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(BILwf;)V",
      line = 87
   )
   private final void method5473(byte arg0, int arg1, class147 arg2) {
      try {
         ++field11168;
         if (arg0 < -15) {
            if (~arg1 != -2) {
               if (~arg1 == -3) {
                  this.field11165 = arg2.method1143(-15465);
                  return;
               }

               if (arg1 != 3) {
                  if (arg1 != 5) {
                     if (~arg1 == -8) {
                        this.field11178 = class330.method2442(arg2.method1166((byte)-52), -81);
                        return;
                     }

                     if (arg1 == 8) {
                        this.field11169.field4391 = this.field11161;
                        return;
                     }

                     if (arg1 != 9) {
                        if (arg1 == 10) {
                           this.field11176 = false;
                           return;
                        }

                        if (arg1 == 11) {
                           this.field11156 = arg2.method1143(-15465);
                           return;
                        }

                        if (arg1 != 12) {
                           if (~arg1 != -14) {
                              if (arg1 == 14) {
                                 this.field11155 = arg2.method1143(-15465) << 2;
                                 return;
                              }

                              if (~arg1 == -17) {
                                 this.field11160 = arg2.method1143(-15465);
                                 return;
                              }
                           } else {
                              this.field11159 = arg2.method1166((byte)-43);
                           }

                           return;
                        }

                        this.field11157 = true;
                        return;
                     }

                     this.field11170 = arg2.method1211(-26166) << 2;
                     return;
                  }

                  this.field11167 = false;
                  return;
               }

               this.field11165 = arg2.method1211(-26166);
               if (~this.field11165 == -65536) {
                  this.field11165 = -1;
                  return;
               }
            } else {
               this.field11154 = class330.method2442(arg2.method1166((byte)-60), -119);
            }

         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11179[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11179[2] : field11179[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(I)V",
      line = 176
   )
   public final void method5474(int arg0) {
      try {
         if (arg0 != -597651576) {
            method5472(-103, (byte)-66);
         }

         ++field11158;
         this.field11156 = this.field11161 | this.field11156 << 8;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11179[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "a",
      descriptor = "(Lwf;I)V",
      line = 187
   )
   public final void method5475(class147 arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         if (arg1 != 0) {
            field11174 = 76;
         }

         ++field11164;

         do {
            int var4 = arg0.method1143(-15465);
            if (var4 == 0) {
               break;
            }

            this.method5473((byte)-125, var4, arg0);
         } while(!var3);

      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field11179[5] + (arg0 != null ? field11179[2] : field11179[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5476(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 126);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5477(char[] arg0) {
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
            var10005 = 16;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 126;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
