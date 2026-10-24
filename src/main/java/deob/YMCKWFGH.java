package deob;

@ObfuscatedName("YMCKWFGH")
public class YMCKWFGH {

	@ObfuscatedName("YMCKWFGH.h")
	public int field1412 = 0;

	@ObfuscatedName("YMCKWFGH.i")
	public int field1413 = 0;

	@ObfuscatedName("YMCKWFGH.j")
	public int field1414;

	@ObfuscatedName("YMCKWFGH.k")
	public int field1415;

	@ObfuscatedName("YMCKWFGH.l")
	public int[][] field1416;

	public YMCKWFGH(int arg0, int arg1) {
		field1414 = arg0;
		field1415 = arg1;
		field1416 = new int[field1414][field1415];
		method569();
	}

	@ObfuscatedName("YMCKWFGH.a()V")
	public void method569() {
		for (int var1 = 0; var1 < field1414; var1++) {
			for (int var2 = 0; var2 < field1415; var2++) {
				if (var1 == 0 || var2 == 0 || field1414 - 1 == var1 || field1415 - 1 == var2) {
					field1416[var1][var2] = 0xFFFFFF;
				} else {
					field1416[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("YMCKWFGH.a(IIZIII)V")
	public void method570(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg3 -= field1412;
		arg0 -= field1413;
		if (arg1 == 0) {
			if (arg4 == 0) {
				method573(arg3, arg0, 128);
				method573(arg3 - 1, arg0, 8);
			}

			if (arg4 == 1) {
				method573(arg3, arg0, 2);
				method573(arg3, arg0 + 1, 32);
			}

			if (arg4 == 2) {
				method573(arg3, arg0, 8);
				method573(arg3 + 1, arg0, 128);
			}

			if (arg4 == 3) {
				method573(arg3, arg0, 32);
				method573(arg3, arg0 - 1, 2);
			}
		}

		if (arg1 == 1 || arg1 == 3) {
			if (arg4 == 0) {
				method573(arg3, arg0, 1);
				method573(arg3 - 1, arg0 + 1, 16);
			}

			if (arg4 == 1) {
				method573(arg3, arg0, 4);
				method573(arg3 + 1, arg0 + 1, 64);
			}

			if (arg4 == 2) {
				method573(arg3, arg0, 16);
				method573(arg3 + 1, arg0 - 1, 1);
			}

			if (arg4 == 3) {
				method573(arg3, arg0, 64);
				method573(arg3 - 1, arg0 - 1, 4);
			}
		}

		if (arg1 == 2) {
			if (arg4 == 0) {
				method573(arg3, arg0, 130);
				method573(arg3 - 1, arg0, 8);
				method573(arg3, arg0 + 1, 32);
			}

			if (arg4 == 1) {
				method573(arg3, arg0, 10);
				method573(arg3, arg0 + 1, 32);
				method573(arg3 + 1, arg0, 128);
			}

			if (arg4 == 2) {
				method573(arg3, arg0, 40);
				method573(arg3 + 1, arg0, 128);
				method573(arg3, arg0 - 1, 2);
			}

			if (arg4 == 3) {
				method573(arg3, arg0, 160);
				method573(arg3, arg0 - 1, 2);
				method573(arg3 - 1, arg0, 8);
			}
		}

		if (arg2) {
			if (arg1 == 0) {
				if (arg4 == 0) {
					method573(arg3, arg0, 0x10000);
					method573(arg3 - 1, arg0, 4096);
				}

				if (arg4 == 1) {
					method573(arg3, arg0, 1024);
					method573(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 2) {
					method573(arg3, arg0, 4096);
					method573(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 3) {
					method573(arg3, arg0, 16384);
					method573(arg3, arg0 - 1, 1024);
				}
			}

			if (arg1 == 1 || arg1 == 3) {
				if (arg4 == 0) {
					method573(arg3, arg0, 512);
					method573(arg3 - 1, arg0 + 1, 8192);
				}

				if (arg4 == 1) {
					method573(arg3, arg0, 2048);
					method573(arg3 + 1, arg0 + 1, 32768);
				}

				if (arg4 == 2) {
					method573(arg3, arg0, 8192);
					method573(arg3 + 1, arg0 - 1, 512);
				}

				if (arg4 == 3) {
					method573(arg3, arg0, 32768);
					method573(arg3 - 1, arg0 - 1, 2048);
				}
			}

			if (arg1 == 2) {
				if (arg4 == 0) {
					method573(arg3, arg0, 66560);
					method573(arg3 - 1, arg0, 4096);
					method573(arg3, arg0 + 1, 16384);
				}

				if (arg4 == 1) {
					method573(arg3, arg0, 5120);
					method573(arg3, arg0 + 1, 16384);
					method573(arg3 + 1, arg0, 0x10000);
				}

				if (arg4 == 2) {
					method573(arg3, arg0, 20480);
					method573(arg3 + 1, arg0, 0x10000);
					method573(arg3, arg0 - 1, 1024);
				}

				if (arg4 == 3) {
					method573(arg3, arg0, 81920);
					method573(arg3, arg0 - 1, 1024);
					method573(arg3 - 1, arg0, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("YMCKWFGH.a(IZIIIII)V")
	public void method571(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg0) {
			var7 += 0x20000;
		}

		arg4 -= field1412;
		arg2 -= field1413;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg1;
			arg1 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg4; var9 < arg1 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1414) {
				for (int var10 = arg2; var10 < arg2 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1415) {
						method573(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("YMCKWFGH.a(III)V")
	public void method572(int arg0, int arg1) {
		arg0 -= field1412;
		arg1 -= field1413;
		field1416[arg0][arg1] |= 0x200000;
	}

	@ObfuscatedName("YMCKWFGH.b(III)V")
	public void method573(int arg0, int arg1, int arg2) {
		field1416[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("YMCKWFGH.a(ZIIIIB)V")
	public void method574(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		arg3 -= field1412;
		arg1 -= field1413;
		if (arg4 == 0) {
			if (arg2 == 0) {
				method576(128, arg3, arg1);
				method576(8, arg3 - 1, arg1);
			}

			if (arg2 == 1) {
				method576(2, arg3, arg1);
				method576(32, arg3, arg1 + 1);
			}

			if (arg2 == 2) {
				method576(8, arg3, arg1);
				method576(128, arg3 + 1, arg1);
			}

			if (arg2 == 3) {
				method576(32, arg3, arg1);
				method576(2, arg3, arg1 - 1);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg2 == 0) {
				method576(1, arg3, arg1);
				method576(16, arg3 - 1, arg1 + 1);
			}

			if (arg2 == 1) {
				method576(4, arg3, arg1);
				method576(64, arg3 + 1, arg1 + 1);
			}

			if (arg2 == 2) {
				method576(16, arg3, arg1);
				method576(1, arg3 + 1, arg1 - 1);
			}

			if (arg2 == 3) {
				method576(64, arg3, arg1);
				method576(4, arg3 - 1, arg1 - 1);
			}
		}

		if (arg4 == 2) {
			if (arg2 == 0) {
				method576(130, arg3, arg1);
				method576(8, arg3 - 1, arg1);
				method576(32, arg3, arg1 + 1);
			}

			if (arg2 == 1) {
				method576(10, arg3, arg1);
				method576(32, arg3, arg1 + 1);
				method576(128, arg3 + 1, arg1);
			}

			if (arg2 == 2) {
				method576(40, arg3, arg1);
				method576(128, arg3 + 1, arg1);
				method576(2, arg3, arg1 - 1);
			}

			if (arg2 == 3) {
				method576(160, arg3, arg1);
				method576(2, arg3, arg1 - 1);
				method576(8, arg3 - 1, arg1);
			}
		}

		if (arg0) {
			if (arg4 == 0) {
				if (arg2 == 0) {
					method576(0x10000, arg3, arg1);
					method576(4096, arg3 - 1, arg1);
				}

				if (arg2 == 1) {
					method576(1024, arg3, arg1);
					method576(16384, arg3, arg1 + 1);
				}

				if (arg2 == 2) {
					method576(4096, arg3, arg1);
					method576(0x10000, arg3 + 1, arg1);
				}

				if (arg2 == 3) {
					method576(16384, arg3, arg1);
					method576(1024, arg3, arg1 - 1);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg2 == 0) {
					method576(512, arg3, arg1);
					method576(8192, arg3 - 1, arg1 + 1);
				}

				if (arg2 == 1) {
					method576(2048, arg3, arg1);
					method576(32768, arg3 + 1, arg1 + 1);
				}

				if (arg2 == 2) {
					method576(8192, arg3, arg1);
					method576(512, arg3 + 1, arg1 - 1);
				}

				if (arg2 == 3) {
					method576(32768, arg3, arg1);
					method576(2048, arg3 - 1, arg1 - 1);
				}
			}

			if (arg4 == 2) {
				if (arg2 == 0) {
					method576(66560, arg3, arg1);
					method576(4096, arg3 - 1, arg1);
					method576(16384, arg3, arg1 + 1);
				}

				if (arg2 == 1) {
					method576(5120, arg3, arg1);
					method576(16384, arg3, arg1 + 1);
					method576(0x10000, arg3 + 1, arg1);
				}

				if (arg2 == 2) {
					method576(20480, arg3, arg1);
					method576(0x10000, arg3 + 1, arg1);
					method576(1024, arg3, arg1 - 1);
				}

				if (arg2 == 3) {
					method576(81920, arg3, arg1);
					method576(1024, arg3, arg1 - 1);
					method576(4096, arg3 - 1, arg1);
					return;
				}
			}
		}
	}

	@ObfuscatedName("YMCKWFGH.a(IIIZIII)V")
	public void method575(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg5 -= field1412;
		arg1 -= field1413;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg4;
			arg4 = arg3;
			arg3 = var8;
		}

		for (int var9 = arg5; var9 < arg4 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1414) {
				for (int var10 = arg1; var10 < arg1 + arg3; var10++) {
					if (var10 >= 0 && var10 < field1415) {
						method576(var7, var9, var10);
					}
				}
			}
		}
	}

	@ObfuscatedName("YMCKWFGH.a(ZIII)V")
	public void method576(int arg0, int arg1, int arg2) {
		field1416[arg1][arg2] &= 0xFFFFFF - arg0;
	}

	@ObfuscatedName("YMCKWFGH.c(III)V")
	public void method577(int arg0, int arg1) {
		arg1 -= field1412;
		arg0 -= field1413;
		field1416[arg1][arg0] &= 0xDFFFFF;
	}

	@ObfuscatedName("YMCKWFGH.a(IIIIIII)Z")
	public boolean method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg3 && arg1 == arg5) {
			return true;
		}

		arg0 -= field1412;
		arg1 -= field1413;
		arg3 -= field1412;
		arg5 -= field1413;
		if (arg2 == 0) {
			if (arg4 == 0) {
				if (arg3 - 1 == arg0 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg3 && arg5 + 1 == arg1 && (field1416[arg0][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg5 - 1 == arg1 && (field1416[arg0][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg0 == arg3 && arg5 + 1 == arg1) {
					return true;
				}

				if (arg3 - 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg3 + 1 == arg0 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg3 && arg5 + 1 == arg1 && (field1416[arg0][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg5 - 1 == arg1 && (field1416[arg0][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg0 == arg3 && arg5 - 1 == arg1) {
					return true;
				}

				if (arg3 - 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg2 == 2) {
			if (arg4 == 0) {
				if (arg3 - 1 == arg0 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg3 && arg5 + 1 == arg1) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg5 - 1 == arg1 && (field1416[arg0][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg3 - 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg5 + 1 == arg1) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg3 && arg5 - 1 == arg1 && (field1416[arg0][arg1] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg3 - 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg5 + 1 == arg1 && (field1416[arg0][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg3 && arg5 - 1 == arg1) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg3 - 1 == arg0 && arg1 == arg5) {
					return true;
				}

				if (arg0 == arg3 && arg5 + 1 == arg1 && (field1416[arg0][arg1] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg5 - 1 == arg1) {
					return true;
				}
			}
		}

		if (arg2 == 9) {
			if (arg0 == arg3 && arg5 + 1 == arg1 && (field1416[arg0][arg1] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg3 && arg5 - 1 == arg1 && (field1416[arg0][arg1] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg0 && arg1 == arg5 && (field1416[arg0][arg1] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("YMCKWFGH.b(IIIIIII)Z")
	public boolean method579(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg1 == arg5 && arg2 == arg3) {
			return true;
		}

		arg5 -= field1412;
		arg3 -= field1413;
		arg1 -= field1412;
		arg2 -= field1413;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg1 + 1 == arg5 && arg2 == arg3 && (field1416[arg5][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field1416[arg5][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (field1416[arg5][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 - 1 == arg3 && (field1416[arg5][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg1 - 1 == arg5 && arg2 == arg3 && (field1416[arg5][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field1416[arg5][arg3] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg1 + 1 == arg5 && arg2 == arg3 && (field1416[arg5][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg1 == arg5 && arg2 + 1 == arg3 && (field1416[arg5][arg3] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg1 == arg5 && arg2 + 1 == arg3 && (field1416[arg5][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg1 == arg5 && arg2 - 1 == arg3 && (field1416[arg5][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg1 - 1 == arg5 && arg2 == arg3 && (field1416[arg5][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg1 + 1 == arg5 && arg2 == arg3 && (field1416[arg5][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("YMCKWFGH.a(IIIIBIII)Z")
	public boolean method580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg4 + arg5 - 1;
		int var9 = arg0 + arg1 - 1;
		if (arg3 >= arg5 && arg3 <= var8 && arg2 >= arg1 && arg2 <= var9) {
			return true;
		}

		if (arg5 - 1 == arg3 && arg2 >= arg1 && arg2 <= var9 && (field1416[arg3 - field1412][arg2 - field1413] & 0x8) == 0 && (arg6 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg3 && arg2 >= arg1 && arg2 <= var9 && (field1416[arg3 - field1412][arg2 - field1413] & 0x80) == 0 && (arg6 & 0x2) == 0) {
			return true;
		}

		if (arg1 - 1 == arg2 && arg3 >= arg5 && arg3 <= var8 && (field1416[arg3 - field1412][arg2 - field1413] & 0x2) == 0 && (arg6 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg2 && arg3 >= arg5 && arg3 <= var8 && (field1416[arg3 - field1412][arg2 - field1413] & 0x20) == 0 && (arg6 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
