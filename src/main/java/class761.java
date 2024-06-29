import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class761 {
   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11192 = new String[]{method5517(method5516("c2~e\u0010^:o5'N#jetN%mz&\u0011")), method5517(method5516("A6it,\u0005:~{5L2rp:_yRW1J9Lp&]2mV;E9zv B8q")), method5517(method5516("A6itzG6qrzx#m|:L")), method5517(method5516("A6itzG6qrzF6qt3N:z{ \u0005\u001a~{5L2rp:_\u0011~v D%f")), method5517(method5516("H41Q|")), method5517(method5516("H8r;'^91x5E6xp9N9k;\u001cD#Le;_\u0013vt3E8la=H\u001aGW1J9")), method5517(method5516("E2hE8J#yz&F\u001aGW1J9Og;S.")), method5517(method5516("H8r;'^91x5E6xp9N9k/ R'z(\u001cD#Le;_\u0013vt3E8la=H")), method5517(method5516("A6itzG6qrzh;~f'")), method5517(method5516("L2kE8J#yz&F\u001a]p5E\u0004zg\"N%")), method5517(method5516("Py1;)")), method5517(method5516("H41V|")), method5517(method5516("E\"sy")), method5517(method5516("H41T|")), method5517(method5516("H41W|"))};
   @OriginalMember(
      owner = "client!cc",
      name = "e",
      descriptor = "I"
   )
   public static int field11186;
   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "I"
   )
   public static int field11187;
   @OriginalMember(
      owner = "client!cc",
      name = "g",
      descriptor = "I"
   )
   public static int field11188;
   @OriginalMember(
      owner = "client!cc",
      name = "d",
      descriptor = "Leq;"
   )
   public static class221 field11185;
   @OriginalMember(
      owner = "client!cc",
      name = "c",
      descriptor = "Leaa;"
   )
   public static class526 field11189;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11190;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!cc",
      name = "f",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field11191;

   @OriginalMember(
      owner = "client!cc",
      name = "b",
      descriptor = "(I)I"
   )
   public static final int method5511(int arg0) {
      try {
         ++field11186;
         if (arg0 != 1) {
            field11189 = null;
         }

         return class734.field10888;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11192[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method5512(int arg0, String arg1) {
      int var2 = client.field4530;

      try {
         ++field11188;
         if (arg1 != null) {
            if (arg1.startsWith("*")) {
               arg1 = arg1.substring(1);
            }

            String var3 = class70.method696((byte)-107, arg1);
            if (var3 != null) {
               if (arg0 != 1) {
                  field11189 = null;
               }

               int var4 = 0;
               if (var2 != 0 || ~class423.field6418 < ~var4) {
                  do {
                     String var5 = class751.field11119[var4];
                     if (var5.startsWith("*")) {
                        var5 = var5.substring(1);
                     }

                     String var6 = class70.method696((byte)-90, var5);
                     if (var6 != null && var6.equals(var3)) {
                        --class423.field6418;
                        int var7 = var4;
                        if (var2 != 0) {
                           class751.field11119[var4] = class751.field11119[var4 + 1];
                           class787.field11446[var4] = class787.field11446[var4 - -1];
                           class732.field10857[var4] = class732.field10857[var4 + 1];
                           class331.field4746[var4] = class331.field4746[var4 - -1];
                           class770.field11291[var4] = class770.field11291[var4 + 1];
                           class29.field318[var4] = class29.field318[var4 + 1];
                           var7 = var4 + 1;
                        }

                        while(true) {
                           while(var7 < class423.field6418) {
                              class751.field11119[var7] = class751.field11119[var7 + 1];
                              class787.field11446[var7] = class787.field11446[var7 - -1];
                              class732.field10857[var7] = class732.field10857[var7 + 1];
                              class331.field4746[var7] = class331.field4746[var7 - -1];
                              class770.field11291[var7] = class770.field11291[var7 + 1];
                              class29.field318[var7] = class29.field318[var7 + 1];
                              ++var7;
                           }

                           class310.field4417 = class456.field6922;
                           ++class46.field538;
                           class180 var8 = class486.method3603(class741.field10991, (byte)-16, class48.field583);
                           var8.field2211.method1085(class543.method4009(true, arg1), (byte)-11);
                           var8.field2211.method1101(arg1, -82);
                           class763.method5527(false, var8);
                           if (var2 == 0) {
                              return;
                           }

                           ++var7;
                        }
                     }

                     ++var4;
                  } while(~class423.field6418 < ~var4);

               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field11192[11] + arg0 + ',' + (arg1 != null ? field11192[10] : field11192[12]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method5513(byte arg0) {
      try {
         if (arg0 != -113) {
            field11185 = null;
         }

         field11185 = null;
         field11189 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field11192[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(I)V"
   )
   public static final synchronized void method5514(int arg0) {
      try {
         ++field11187;
         if (class752.field11125 == null) {
            try {
               Class var1 = Class.forName(field11192[3]);
               Method var2 = var1.getDeclaredMethod(field11192[9], (Class[])null);
               Object var3 = var2.invoke((Object)null, (Object[])null);
               Method var4 = var1.getMethod(field11192[6], Class.forName(field11192[1]), field11190 != null ? field11190 : (field11190 = method5515(field11192[2])), field11191 != null ? field11191 : (field11191 = method5515(field11192[8])));
               class752.field11125 = var4.invoke((Object)null, var3, field11192[7], Class.forName(field11192[5]));
               if (arg0 != 1) {
                  method5513((byte)3);
               }
            } catch (Exception var7) {
               System.out.println(field11192[0]);
               var7.printStackTrace();
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field11192[4] + arg0 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!cc",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method5515(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5516(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5517(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 43;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 31;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
