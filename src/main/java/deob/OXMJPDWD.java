package deob;

@ObfuscatedName("OXMJPDWD")
public class OXMJPDWD {

	@ObfuscatedName("OXMJPDWD.j")
	public int field1051 = 0;

	@ObfuscatedName("OXMJPDWD.k")
	public int field1052 = 0;

	@ObfuscatedName("OXMJPDWD.l")
	public int field1053;

	@ObfuscatedName("OXMJPDWD.m")
	public int field1054;

	@ObfuscatedName("OXMJPDWD.n")
	public int[][] field1055;

	public OXMJPDWD(int arg0, int arg1) {
		field1053 = arg1;
		field1054 = arg0;
		field1055 = new int[field1053][field1054];
		method380();
	}

	@ObfuscatedName("OXMJPDWD.a()V")
	public void method380() {
		for (int var1 = 0; var1 < field1053; var1++) {
			for (int var2 = 0; var2 < field1054; var2++) {
				if (var1 == 0 || var2 == 0 || field1053 - 1 == var1 || field1054 - 1 == var2) {
					field1055[var1][var2] = 0xFFFFFF;
				} else {
					field1055[var1][var2] = 0x1000000;
				}
			}
		}
	}

	@ObfuscatedName("OXMJPDWD.a(IIIZII)V")
	public void method381(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
		arg4 -= field1051;
		arg1 -= field1052;
		if (arg0 == 0) {
			if (arg3 == 0) {
				method384(arg4, arg1, 128);
				method384(arg4 - 1, arg1, 8);
			}

			if (arg3 == 1) {
				method384(arg4, arg1, 2);
				method384(arg4, arg1 + 1, 32);
			}

			if (arg3 == 2) {
				method384(arg4, arg1, 8);
				method384(arg4 + 1, arg1, 128);
			}

			if (arg3 == 3) {
				method384(arg4, arg1, 32);
				method384(arg4, arg1 - 1, 2);
			}
		}

		if (arg0 == 1 || arg0 == 3) {
			if (arg3 == 0) {
				method384(arg4, arg1, 1);
				method384(arg4 - 1, arg1 + 1, 16);
			}

			if (arg3 == 1) {
				method384(arg4, arg1, 4);
				method384(arg4 + 1, arg1 + 1, 64);
			}

			if (arg3 == 2) {
				method384(arg4, arg1, 16);
				method384(arg4 + 1, arg1 - 1, 1);
			}

			if (arg3 == 3) {
				method384(arg4, arg1, 64);
				method384(arg4 - 1, arg1 - 1, 4);
			}
		}

		if (arg0 == 2) {
			if (arg3 == 0) {
				method384(arg4, arg1, 130);
				method384(arg4 - 1, arg1, 8);
				method384(arg4, arg1 + 1, 32);
			}

			if (arg3 == 1) {
				method384(arg4, arg1, 10);
				method384(arg4, arg1 + 1, 32);
				method384(arg4 + 1, arg1, 128);
			}

			if (arg3 == 2) {
				method384(arg4, arg1, 40);
				method384(arg4 + 1, arg1, 128);
				method384(arg4, arg1 - 1, 2);
			}

			if (arg3 == 3) {
				method384(arg4, arg1, 160);
				method384(arg4, arg1 - 1, 2);
				method384(arg4 - 1, arg1, 8);
			}
		}

		if (arg2) {
			if (arg0 == 0) {
				if (arg3 == 0) {
					method384(arg4, arg1, 0x10000);
					method384(arg4 - 1, arg1, 4096);
				}

				if (arg3 == 1) {
					method384(arg4, arg1, 1024);
					method384(arg4, arg1 + 1, 16384);
				}

				if (arg3 == 2) {
					method384(arg4, arg1, 4096);
					method384(arg4 + 1, arg1, 0x10000);
				}

				if (arg3 == 3) {
					method384(arg4, arg1, 16384);
					method384(arg4, arg1 - 1, 1024);
				}
			}

			if (arg0 == 1 || arg0 == 3) {
				if (arg3 == 0) {
					method384(arg4, arg1, 512);
					method384(arg4 - 1, arg1 + 1, 8192);
				}

				if (arg3 == 1) {
					method384(arg4, arg1, 2048);
					method384(arg4 + 1, arg1 + 1, 32768);
				}

				if (arg3 == 2) {
					method384(arg4, arg1, 8192);
					method384(arg4 + 1, arg1 - 1, 512);
				}

				if (arg3 == 3) {
					method384(arg4, arg1, 32768);
					method384(arg4 - 1, arg1 - 1, 2048);
				}
			}

			if (arg0 == 2) {
				if (arg3 == 0) {
					method384(arg4, arg1, 66560);
					method384(arg4 - 1, arg1, 4096);
					method384(arg4, arg1 + 1, 16384);
				}

				if (arg3 == 1) {
					method384(arg4, arg1, 5120);
					method384(arg4, arg1 + 1, 16384);
					method384(arg4 + 1, arg1, 0x10000);
				}

				if (arg3 == 2) {
					method384(arg4, arg1, 20480);
					method384(arg4 + 1, arg1, 0x10000);
					method384(arg4, arg1 - 1, 1024);
				}

				if (arg3 == 3) {
					method384(arg4, arg1, 81920);
					method384(arg4, arg1 - 1, 1024);
					method384(arg4 - 1, arg1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("OXMJPDWD.a(IIIIIZI)V")
	public void method382(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
		int var7 = 256;
		if (arg4) {
			var7 += 0x20000;
		}

		arg5 -= field1051;
		arg0 -= field1052;

		if (arg3 == 1 || arg3 == 3) {
			int var8 = arg2;
			arg2 = arg1;
			arg1 = var8;
		}

		for (int var9 = arg5; var9 < arg2 + arg5; var9++) {
			if (var9 >= 0 && var9 < field1053) {
				for (int var10 = arg0; var10 < arg0 + arg1; var10++) {
					if (var10 >= 0 && var10 < field1054) {
						method384(var9, var10, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("OXMJPDWD.a(III)V")
	public void method383(int arg0, int arg1) {
		arg1 -= field1051;
		arg0 -= field1052;
		field1055[arg1][arg0] |= 0x200000;
	}

	@ObfuscatedName("OXMJPDWD.b(III)V")
	public void method384(int arg0, int arg1, int arg2) {
		field1055[arg0][arg1] |= arg2;
	}

	@ObfuscatedName("OXMJPDWD.a(IZIIIZ)V")
	public void method385(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
		arg3 -= field1051;
		arg2 -= field1052;
		if (arg4 == 0) {
			if (arg0 == 0) {
				method387(arg2, arg3, 128);
				method387(arg2, arg3 - 1, 8);
			}

			if (arg0 == 1) {
				method387(arg2, arg3, 2);
				method387(arg2 + 1, arg3, 32);
			}

			if (arg0 == 2) {
				method387(arg2, arg3, 8);
				method387(arg2, arg3 + 1, 128);
			}

			if (arg0 == 3) {
				method387(arg2, arg3, 32);
				method387(arg2 - 1, arg3, 2);
			}
		}

		if (arg4 == 1 || arg4 == 3) {
			if (arg0 == 0) {
				method387(arg2, arg3, 1);
				method387(arg2 + 1, arg3 - 1, 16);
			}

			if (arg0 == 1) {
				method387(arg2, arg3, 4);
				method387(arg2 + 1, arg3 + 1, 64);
			}

			if (arg0 == 2) {
				method387(arg2, arg3, 16);
				method387(arg2 - 1, arg3 + 1, 1);
			}

			if (arg0 == 3) {
				method387(arg2, arg3, 64);
				method387(arg2 - 1, arg3 - 1, 4);
			}
		}

		if (arg4 == 2) {
			if (arg0 == 0) {
				method387(arg2, arg3, 130);
				method387(arg2, arg3 - 1, 8);
				method387(arg2 + 1, arg3, 32);
			}

			if (arg0 == 1) {
				method387(arg2, arg3, 10);
				method387(arg2 + 1, arg3, 32);
				method387(arg2, arg3 + 1, 128);
			}

			if (arg0 == 2) {
				method387(arg2, arg3, 40);
				method387(arg2, arg3 + 1, 128);
				method387(arg2 - 1, arg3, 2);
			}

			if (arg0 == 3) {
				method387(arg2, arg3, 160);
				method387(arg2 - 1, arg3, 2);
				method387(arg2, arg3 - 1, 8);
			}
		}

		if (arg1) {
			if (arg4 == 0) {
				if (arg0 == 0) {
					method387(arg2, arg3, 0x10000);
					method387(arg2, arg3 - 1, 4096);
				}

				if (arg0 == 1) {
					method387(arg2, arg3, 1024);
					method387(arg2 + 1, arg3, 16384);
				}

				if (arg0 == 2) {
					method387(arg2, arg3, 4096);
					method387(arg2, arg3 + 1, 0x10000);
				}

				if (arg0 == 3) {
					method387(arg2, arg3, 16384);
					method387(arg2 - 1, arg3, 1024);
				}
			}

			if (arg4 == 1 || arg4 == 3) {
				if (arg0 == 0) {
					method387(arg2, arg3, 512);
					method387(arg2 + 1, arg3 - 1, 8192);
				}

				if (arg0 == 1) {
					method387(arg2, arg3, 2048);
					method387(arg2 + 1, arg3 + 1, 32768);
				}

				if (arg0 == 2) {
					method387(arg2, arg3, 8192);
					method387(arg2 - 1, arg3 + 1, 512);
				}

				if (arg0 == 3) {
					method387(arg2, arg3, 32768);
					method387(arg2 - 1, arg3 - 1, 2048);
				}
			}

			if (arg4 == 2) {
				if (arg0 == 0) {
					method387(arg2, arg3, 66560);
					method387(arg2, arg3 - 1, 4096);
					method387(arg2 + 1, arg3, 16384);
				}

				if (arg0 == 1) {
					method387(arg2, arg3, 5120);
					method387(arg2 + 1, arg3, 16384);
					method387(arg2, arg3 + 1, 0x10000);
				}

				if (arg0 == 2) {
					method387(arg2, arg3, 20480);
					method387(arg2, arg3 + 1, 0x10000);
					method387(arg2 - 1, arg3, 1024);
				}

				if (arg0 == 3) {
					method387(arg2, arg3, 81920);
					method387(arg2 - 1, arg3, 1024);
					method387(arg2, arg3 - 1, 4096);
					return;
				}
			}
		}
	}

	@ObfuscatedName("OXMJPDWD.a(IIZIIIZ)V")
	public void method386(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
		int var7 = 256;
		if (arg2) {
			var7 += 0x20000;
		}

		arg1 -= field1051;
		arg3 -= field1052;

		if (arg0 == 1 || arg0 == 3) {
			int var8 = arg4;
			arg4 = arg5;
			arg5 = var8;
		}

		for (int var9 = arg1; var9 < arg1 + arg4; var9++) {
			if (var9 >= 0 && var9 < field1053) {
				for (int var10 = arg3; var10 < arg3 + arg5; var10++) {
					if (var10 >= 0 && var10 < field1054) {
						method387(var10, var9, var7);
					}
				}
			}
		}
	}

	@ObfuscatedName("OXMJPDWD.a(ZIII)V")
	public void method387(int arg0, int arg1, int arg2) {
		field1055[arg1][arg0] &= 0xFFFFFF - arg2;
	}

	@ObfuscatedName("OXMJPDWD.a(ZII)V")
	public void method388(int arg0, int arg1) {
		arg0 -= field1051;
		arg1 -= field1052;
		field1055[arg0][arg1] &= 0xDFFFFF;
	}

	@ObfuscatedName("OXMJPDWD.a(IIIIIII)Z")
	public boolean method389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg0 == arg3 && arg1 == arg4) {
			return true;
		}

		arg0 -= field1051;
		arg4 -= field1052;
		arg3 -= field1051;
		arg1 -= field1052;
		if (arg5 == 0) {
			if (arg2 == 0) {
				if (arg3 - 1 == arg0 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1055[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1055[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg0 == arg3 && arg1 + 1 == arg4) {
					return true;
				}

				if (arg3 - 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg3 + 1 == arg0 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1055[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1055[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg0 == arg3 && arg1 - 1 == arg4) {
					return true;
				}

				if (arg3 - 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}
			}
		}

		if (arg5 == 2) {
			if (arg2 == 0) {
				if (arg3 - 1 == arg0 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1055[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 1) {
				if (arg3 - 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4 && (field1055[arg0][arg4] & 0x1280102) == 0) {
					return true;
				}
			} else if (arg2 == 2) {
				if (arg3 - 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x1280108) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1055[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4) {
					return true;
				}
			} else if (arg2 == 3) {
				if (arg3 - 1 == arg0 && arg1 == arg4) {
					return true;
				}

				if (arg0 == arg3 && arg1 + 1 == arg4 && (field1055[arg0][arg4] & 0x1280120) == 0) {
					return true;
				}

				if (arg3 + 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x1280180) == 0) {
					return true;
				}

				if (arg0 == arg3 && arg1 - 1 == arg4) {
					return true;
				}
			}
		}

		if (arg5 == 9) {
			if (arg0 == arg3 && arg1 + 1 == arg4 && (field1055[arg0][arg4] & 0x20) == 0) {
				return true;
			}

			if (arg0 == arg3 && arg1 - 1 == arg4 && (field1055[arg0][arg4] & 0x2) == 0) {
				return true;
			}

			if (arg3 - 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x8) == 0) {
				return true;
			}

			if (arg3 + 1 == arg0 && arg1 == arg4 && (field1055[arg0][arg4] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("OXMJPDWD.b(IIIIIII)Z")
	public boolean method390(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
		if (arg2 == arg5 && arg1 == arg3) {
			return true;
		}

		arg5 -= field1051;
		arg3 -= field1052;
		arg2 -= field1051;
		arg1 -= field1052;
		if (arg0 == 6 || arg0 == 7) {
			if (arg0 == 7) {
				arg4 = arg4 + 2 & 0x3;
			}

			if (arg4 == 0) {
				if (arg2 + 1 == arg5 && arg1 == arg3 && (field1055[arg5][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg3 && (field1055[arg5][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 1) {
				if (arg2 - 1 == arg5 && arg1 == arg3 && (field1055[arg5][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 - 1 == arg3 && (field1055[arg5][arg3] & 0x2) == 0) {
					return true;
				}
			} else if (arg4 == 2) {
				if (arg2 - 1 == arg5 && arg1 == arg3 && (field1055[arg5][arg3] & 0x8) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg3 && (field1055[arg5][arg3] & 0x20) == 0) {
					return true;
				}
			} else if (arg4 == 3) {
				if (arg2 + 1 == arg5 && arg1 == arg3 && (field1055[arg5][arg3] & 0x80) == 0) {
					return true;
				}

				if (arg2 == arg5 && arg1 + 1 == arg3 && (field1055[arg5][arg3] & 0x20) == 0) {
					return true;
				}
			}
		}

		if (arg0 == 8) {
			if (arg2 == arg5 && arg1 + 1 == arg3 && (field1055[arg5][arg3] & 0x20) == 0) {
				return true;
			}

			if (arg2 == arg5 && arg1 - 1 == arg3 && (field1055[arg5][arg3] & 0x2) == 0) {
				return true;
			}

			if (arg2 - 1 == arg5 && arg1 == arg3 && (field1055[arg5][arg3] & 0x8) == 0) {
				return true;
			}

			if (arg2 + 1 == arg5 && arg1 == arg3 && (field1055[arg5][arg3] & 0x80) == 0) {
				return true;
			}
		}

		return false;
	}

	@ObfuscatedName("OXMJPDWD.a(IIZIIIII)Z")
	public boolean method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		int var8 = arg0 + arg3 - 1;
		int var9 = arg2 + arg5 - 1;
		if (arg6 >= arg0 && arg6 <= var8 && arg4 >= arg2 && arg4 <= var9) {
			return true;
		}

		if (arg0 - 1 == arg6 && arg4 >= arg2 && arg4 <= var9 && (field1055[arg6 - field1051][arg4 - field1052] & 0x8) == 0 && (arg1 & 0x8) == 0) {
			return true;
		}

		if (var8 + 1 == arg6 && arg4 >= arg2 && arg4 <= var9 && (field1055[arg6 - field1051][arg4 - field1052] & 0x80) == 0 && (arg1 & 0x2) == 0) {
			return true;
		}

		if (arg2 - 1 == arg4 && arg6 >= arg0 && arg6 <= var8 && (field1055[arg6 - field1051][arg4 - field1052] & 0x2) == 0 && (arg1 & 0x4) == 0) {
			return true;
		}

		if (var9 + 1 == arg4 && arg6 >= arg0 && arg6 <= var8 && (field1055[arg6 - field1051][arg4 - field1052] & 0x20) == 0 && (arg1 & 0x1) == 0) {
			return true;
		}

		return false;
	}
}
